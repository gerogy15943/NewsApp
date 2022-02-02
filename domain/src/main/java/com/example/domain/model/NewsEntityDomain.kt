package com.example.domain.model

data class NewsEntityDomain(
    val uid: Int,
    val author: String,
    val title: String,
    val desc: String,
    val image: String
) {
}