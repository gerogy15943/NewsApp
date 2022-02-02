package com.example.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.local.entity.NewsEntity

@Dao
interface NewsDao {

    @Query("SELECT * FROM NewsEntity")
    fun getNews(): List<NewsEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNews(list: List<NewsEntity>)
}