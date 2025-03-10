package cl.app.photoleague.Model

import com.google.gson.annotations.SerializedName

data class NewsArticle(
    val id: String,
    val category: String,
    val title: String,
    @SerializedName("image")
    val imageUrl: String,
    val content: String
)
