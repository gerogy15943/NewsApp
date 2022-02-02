package com.example.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NewsEntity(
    @PrimaryKey
    val uid: Int,
    @ColumnInfo
    val author: String,
    @ColumnInfo
    val title: String,
    @ColumnInfo
    val desc: String,
    @ColumnInfo
    val image: String
) {

}