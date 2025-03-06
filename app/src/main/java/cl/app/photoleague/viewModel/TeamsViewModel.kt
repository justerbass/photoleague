package cl.app.photoleague.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.app.photoleague.Model.Races
import cl.app.photoleague.Model.Resource
import cl.app.photoleague.Model.ResultadoResponse
import cl.app.photoleague.Model.Teams
import cl.app.photoleague.repository.PhotoLeagueRepository
import cl.app.photoleague.repository.TeamsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TeamsViewModel @Inject constructor(
    teamsRepository: TeamsRepository,
    private val photoLeagueRepository: PhotoLeagueRepository
) : ViewModel() {


    private val allTeams = teamsRepository.getTeams()
    private val allRaces = teamsRepository.getRaces()

    private val _selectedCategory = MutableStateFlow(" ")
    val selectedCategory: StateFlow<String> = _selectedCategory

    private val _teams = MutableStateFlow<List<Teams>>(allTeams)
    val teams: StateFlow<List<Teams>> = _teams


    private val _resultadosF3 = MutableStateFlow<Resource<ResultadoResponse>?>(null)
    val resultadosF3: StateFlow<Resource<ResultadoResponse>?> = _resultadosF3

    private val _resultadosF2 = MutableStateFlow<Resource<ResultadoResponse>?>(null)
    val resultadosF2: StateFlow<Resource<ResultadoResponse>?> = _resultadosF2

    private val _resultadosF1 = MutableStateFlow<Resource<ResultadoResponse>?>(null)
    val resultadosF1: StateFlow<Resource<ResultadoResponse>?> = _resultadosF1

    init {
        viewModelScope.launch {
            _resultadosF3.value = photoLeagueRepository.getResultsF3()
            _resultadosF2.value = photoLeagueRepository.getResultsF2()
            _resultadosF1.value = photoLeagueRepository.getResultsF1()
        }
    }

    fun selectCategory(category: String) {
        _selectedCategory.value = category
    }

    fun getTeamByName(teamName: String): Teams? {
        return teams.value.find { it.name == teamName }
    }

    fun getRacesByCategory(category: String): List<Races> {
        return allRaces.filter { it.category == category }
    }
}
