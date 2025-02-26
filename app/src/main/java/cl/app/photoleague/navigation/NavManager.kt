package cl.app.photoleague.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import cl.app.photoleague.view.Calendar
import cl.app.photoleague.view.HomeScreen
import cl.app.photoleague.view.News
import cl.app.photoleague.view.Standing
import cl.app.photoleague.view.Streaming
import cl.app.photoleague.view.TeamProfile

@Composable
fun NavManager(){

    val navControler = rememberNavController()

    NavHost(navController = navControler, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen(navController = navControler)
        }

        composable(Screen.Calendar.route) {
            Calendar(navController = navControler)
        }

        composable(Screen.Standing.route) {
            Standing(navController = navControler)
        }

        composable(Screen.TeamProfile.route) {
            TeamProfile(navController = navControler)
        }

        composable(Screen.Streaming.route) {
            Streaming(navController = navControler)
        }

        composable(Screen.News.route) {
            News(navController = navControler)
        }
    }
}

