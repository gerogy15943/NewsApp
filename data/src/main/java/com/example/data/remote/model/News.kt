package com.example.data.remote.model

import com.google.gson.annotations.SerializedName

data class News(
    val author: String,
    val title: String,
    val description: String,
    val urlToImage: String
)


data class NewsResponse(
    @SerializedName("articles")
    val resultList: List<News>
){

}
