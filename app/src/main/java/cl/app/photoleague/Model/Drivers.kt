package cl.app.photoleague.Model

data class Driver(
    val id: Int,
    val name: String,
    val teamId: String,
    val category: String,
    val points: Int
)