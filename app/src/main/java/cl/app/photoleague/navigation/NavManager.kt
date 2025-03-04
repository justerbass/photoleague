package cl.app.photoleague.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import cl.app.photoleague.view.Calendar
import cl.app.photoleague.view.HomeScreen
import cl.app.photoleague.view.News
import cl.app.photoleague.view.Standing
import cl.app.photoleague.view.Streaming
import cl.app.photoleague.view.TeamProfile
import cl.app.photoleague.viewModel.TeamsViewModel

@Composable
fun NavManager(viewModel: TeamsViewModel){

    val navControler = rememberNavController()

    NavHost(navController = navControler, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen(navController = navControler, viewModel)
        }

        composable(Screen.Calendar.route) {
            Calendar(navController = navControler, viewModel)
        }

        composable(Screen.Standing.route) {
            Standing(navController = navControler, viewModel)
        }

        composable(Screen.TeamProfile.route + "/{teamName}/{category}",
            arguments = listOf(
                navArgument("teamName") { type = NavType.StringType },
                navArgument("category") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val teamName = backStackEntry.arguments?.getString("teamName") ?: ""
            val category = backStackEntry.arguments?.getString("category") ?: ""

            val team = viewModel.getTeamByName(teamName)

            if (team != null) {
                TeamProfile(navController = navControler, team = team, category = category, viewModel)
            } else {
                Text("Error: Equipo no encontrado")
            }
        }

        composable(Screen.Streaming.route) {
            Streaming(navController = navControler)
        }

        composable(Screen.News.route) {
            News(navController = navControler)
        }
    }
}

