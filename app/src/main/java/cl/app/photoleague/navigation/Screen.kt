package cl.app.photoleague.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Calendar : Screen("calendar")
    object Standing : Screen("standing")
    object TeamProfile : Screen("teamProfile")
    object NewsDetail : Screen("newsDetail")
    object News : Screen("news")
}