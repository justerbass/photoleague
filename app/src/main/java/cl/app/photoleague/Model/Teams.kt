package cl.app.photoleague.Model

data class Team(
    val id: String,
    val name: String,
    val f1Drivers: List<Driver>,
    val f2Drivers: List<Driver>,
    val f3Drivers: List<Driver>
) {
    val f1Points: Int
        get() = f1Drivers.sumOf { it.points }

    val f2Points: Int
        get() = f2Drivers.sumOf { it.points }

    val f3Points: Int
        get() = f3Drivers.sumOf { it.points }
}