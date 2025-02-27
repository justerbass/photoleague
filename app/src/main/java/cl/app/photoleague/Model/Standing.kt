package cl.app.photoleague.Model

data class Standing(
    val category: String,
    val teams: List<Teams>
){
    val sortedTeams: List<Teams>
        get() = when (category) {
            "F1 Pro" -> teams.sortedByDescending { it.f1Points }
            "F2 Junior" -> teams.sortedByDescending { it.f2Points }
            "F3 Academy" -> teams.sortedByDescending { it.f3Points }
            else -> emptyList()
        }
}