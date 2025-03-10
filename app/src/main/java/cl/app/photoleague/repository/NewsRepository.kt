package cl.app.photoleague.repository

import cl.app.photoleague.Model.NewsArticle
import cl.app.photoleague.data.NewsApi
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val apiNews: NewsApi
) {
    suspend fun getNews(): List<NewsArticle>{
            val news = apiNews.getNews()
            return news
    }
}