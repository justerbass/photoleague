package cl.app.photoleague.repository

import cl.app.photoleague.Model.Resource
import cl.app.photoleague.Model.ResultadoResponse
import cl.app.photoleague.data.ApiResultPhotoLeague
import javax.inject.Inject

class PhotoLeagueRepository @Inject constructor(
    private val apiResultPhotoLeague: ApiResultPhotoLeague
) {

    suspend fun getResultsF3(): Resource<ResultadoResponse> {
        return try {
            val result = apiResultPhotoLeague.getResultsF3()
            Resource.Success(result)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Error inesperado")
        }
    }

    suspend fun getResultsF2(): Resource<ResultadoResponse> {
        return try {
            val result = apiResultPhotoLeague.getResultsF2()
            Resource.Success(result)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Error inesperado")
        }
    }

    suspend fun getResultsF1(): Resource<ResultadoResponse> {
        return try {
            val result = apiResultPhotoLeague.getResultsF1()
            Resource.Success(result)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Error inesperado")
        }
    }
}
