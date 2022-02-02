package com.example.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.local.dao.NewsDao
import com.example.data.local.entity.NewsEntity

@Database(entities = [NewsEntity::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun newsDao(): NewsDao
}