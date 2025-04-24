package cl.app.photoleague.Model

data class Teams(
    val id: String,
    val name: String,
    val teamPrincipal: String,
    val logo: Int,
    val elite_car: Int,
    val junior_car: Int,
    val academy_car: Int
)