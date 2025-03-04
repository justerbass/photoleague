package cl.app.photoleague.repository

import cl.app.photoleague.Model.Races
import cl.app.photoleague.Model.Teams
import cl.app.photoleague.data.DataSource
import javax.inject.Inject


class TeamsRepository @Inject constructor() {
    fun getTeams(): List<Teams> {
        return DataSource.teams
    }

    fun getRaces(): List<Races> {
        return DataSource.races
    }
}