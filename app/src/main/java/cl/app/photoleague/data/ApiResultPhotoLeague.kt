package cl.app.photoleague.data

import cl.app.photoleague.Model.ResultadoResponse
import cl.app.photoleague.util.Constants
import retrofit2.http.GET

interface ApiResultPhotoLeague {
    @GET(Constants.END_POINT_F3)
    suspend fun getResultsF3(): ResultadoResponse

    @GET(Constants.END_POINT_F2)
    suspend fun getResultsF2(): ResultadoResponse

    @GET(Constants.END_POINT_F1)
    suspend fun getResultsF1(): ResultadoResponse

}