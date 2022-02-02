package com.example.domain.usecases

import com.example.domain.model.NewsEntityDomain
import com.example.domain.repository.NewsRepository

class getNews(val newsRepository: NewsRepository) {

    fun execute(): List<NewsEntityDomain>{
        newsRepository.getNews()

        return emptyList()
    }
}