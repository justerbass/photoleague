package cl.app.photoleague.repository

import cl.app.photoleague.Model.Team
import cl.app.photoleague.data.DataSource

class TeamsRepository{
    fun getTeams(): List<Team> {
        return DataSource.teams
    }
}