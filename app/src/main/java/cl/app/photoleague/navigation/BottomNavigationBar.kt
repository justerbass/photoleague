package cl.app.photoleague.navigation


import androidx.compose.foundation.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import cl.app.photoleague.R


@Composable
fun BottomNavigationBar(navController: NavController,
                        backgroundColor: Color = MaterialTheme.colorScheme.primary,) {
    val items = listOf(Screen.Home, Screen.Calendar, Screen.Standing, Screen.News)
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    NavigationBar {
        items.forEach { screen ->
            NavigationBarItem(
                icon = {
                    when (screen) {
                        Screen.Home -> Image(
                            painter = painterResource(id = R.drawable.baseline_home_24),
                            contentDescription = screen.route
                        )
                        Screen.Calendar -> Image(
                            painter = painterResource(id = R.drawable.baseline_date_range_24),
                            contentDescription = screen.route
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
                label = { Text(screen.route) },
                selected = currentRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route) {
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

