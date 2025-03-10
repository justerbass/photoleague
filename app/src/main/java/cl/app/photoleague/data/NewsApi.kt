package cl.app.photoleague.data

import cl.app.photoleague.Model.NewsArticle
import cl.app.photoleague.util.Constants.Companion.NEWS_ENDPOINT
import retrofit2.http.GET

interface NewsApi {
    @GET(NEWS_ENDPOINT)
    suspend fun getNews(): List<NewsArticle>
}