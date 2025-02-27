package cl.app.photoleague.viewModel

import cl.app.photoleague.Model.Drivers
import cl.app.photoleague.Model.Races
import cl.app.photoleague.Model.Teams
import cl.app.photoleague.repository.TeamsRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class TeamsViewModel() {
    private val repository = TeamsRepository()
    private val allTeams = repository.getTeams()
    private val allRaces = repository.getRaces()

    private val _selectedCategory = MutableStateFlow(" ")
    val selectedCategory: StateFlow<String> = _selectedCategory

    private val _teams = MutableStateFlow<List<Teams>>(filterTeamsByCategory(""))
    val teams: StateFlow<List<Teams>> = _teams

    fun selectCategory(category: String) {
        _selectedCategory.value = category
        _teams.value = filterTeamsByCategory(category)
    }

    fun getTeamByName(teamName: String): Teams? {
        return teams.value.find { it.name == teamName }
    }

    private fun filterTeamsByCategory(category: String): List<Teams> {
        return allTeams.map { team ->
            val filteredDrivers = when (category) {
                "F1 Pro" -> team.f1Drivers
                "F2 Junior" -> team.f2Drivers
                "F3 Academy" -> team.f3Drivers
                else -> emptyList()
            }
            team.copy(
                f1Drivers = filteredDrivers,
                f2Drivers = filteredDrivers,
                f3Drivers = filteredDrivers
            )
        }.filter { it.f1Drivers.isNotEmpty() }
    }

    fun getDriversStanding(category: String): List<Drivers> {
        return allTeams.flatMap { team ->
            when (category) {
                "F1 Pro" -> team.f1Drivers
                "F2 Junior" -> team.f2Drivers
                "F3 Academy" -> team.f3Drivers
                else -> emptyList()
            }
        }.sortedByDescending { it.points }
    }

    fun getTeamsStanding(category: String): List<Teams> {
        return allTeams.sortedByDescending { team ->
            when (category) {
                "F1 Pro" -> team.f1Points
                "F2 Junior" -> team.f2Points
                "F3 Academy" -> team.f3Points
                else -> 0
            }
        }
    }

    fun getRacesByCategory(category: String): List<Races> {
        return allRaces.filter { it.category == category }
    }

}
