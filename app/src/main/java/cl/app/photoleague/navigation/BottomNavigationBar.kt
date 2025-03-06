package cl.app.photoleague.navigation


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import cl.app.photoleague.R
import cl.app.photoleague.Model.ButtonItem


@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(Screen.Home, Screen.Calendar, Screen.Standing, Screen.News)
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    NavigationBar (
        containerColor = MaterialTheme.colorScheme.background,
        tonalElevation = 16.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp)
    ){
        items.forEach { screen ->
            NavigationBarItem(
                icon = {
                    when (screen) {
                        Screen.Home -> Image(
                            painter = painterResource(id = R.drawable.baseline_home_24),
                            contentDescription = screen.route,
                        )
                        Screen.Calendar -> Image(
                            painter = painterResource(id = R.drawable.baseline_date_range_24),
                            contentDescription = screen.route,
                        )
                        Screen.Standing -> Image(
                            painter = painterResource(id = R.drawable.baseline_leaderboard_24),
                            contentDescription = screen.route
                        )

                        Screen.News -> Image(
                            painter = painterResource(id = R.drawable.baseline_info_24),
                            contentDescription = screen.route
                        )
                        else -> Image(
                            painter = painterResource(id = R.drawable.baseline_home_24),
                            contentDescription = screen.route
                        )
                    }
                },
                label = { Text(screen.route.uppercase()) },
                selected = currentRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route) {
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = MaterialTheme.colorScheme.onTertiary
                )
            )
        }
    }
}
