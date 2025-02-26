package cl.app.photoleague.viewModel

import cl.app.photoleague.Model.Team
import cl.app.photoleague.repository.TeamsRepository
import kotlinx.coroutines.flow.MutableStateFlow

class TeamsViewModel (){
    private val repository = TeamsRepository()
    private val _teams = MutableStateFlow<List<Team>>(emptyList())
    val teams= _teams

    init{
        _teams.value = repository.getTeams()
    }

}