package com.example.data.remote

import com.example.data.remote.model.NewsResponse
import retrofit2.Response
import retrofit2.http.GET

interface NewsService {

@GET("/v2/top-headlines?country=ru&apiKey=495246fb9fe84842827584d0771f6d4c")
    fun getNews(): Response<NewsResponse>
}