package cl.app.photoleague.Model

data class Standings(
    val category: String,
    val teams: List<Team>
){
    val sortedTeams: List<Team>
        get() = when (category) {
            "F1" -> teams.sortedByDescending { it.f1Points }
            "F2" -> teams.sortedByDescending { it.f2Points }
            "F3" -> teams.sortedByDescending { it.f3Points }
            else -> emptyList()
        }
}