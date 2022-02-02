package com.example.data.remote.repository

import android.util.Log
import com.example.data.local.dao.NewsDao
import com.example.data.remote.NewsService
import com.example.domain.repository.NewsRepository
import com.example.domain.model.NewsEntityDomain
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(val newsDao: NewsDao, val newsService: NewsService): NewsRepository {
    override fun getNews(): List<NewsEntityDomain> {
        Log.d("TAG", "tututu")
        return emptyList()
    }

    override fun insertNews(list: List<NewsEntityDomain>){
        val resultList = newsService.getNews().body()?.resultList
        Log.d("TAG", resultList.toString())
    }


}