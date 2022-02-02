package com.example.domain.repository

import com.example.domain.model.NewsEntityDomain

interface NewsRepository {
    fun getNews(): List<NewsEntityDomain>


    fun insertNews(list: List<NewsEntityDomain>)
}