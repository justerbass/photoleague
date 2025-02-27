package cl.app.photoleague.Model

data class Teams(
    val id: String,
    val name: String,
    val teamPrincipal: String,
    val f1Drivers: List<Drivers>,
    val f2Drivers: List<Drivers>,
    val f3Drivers: List<Drivers>
) {
    val f1Points: Int
        get() = f1Drivers.sumOf { it.points }

    val f2Points: Int
        get() = f2Drivers.sumOf { it.points }

    val f3Points: Int
        get() = f3Drivers.sumOf { it.points }
}