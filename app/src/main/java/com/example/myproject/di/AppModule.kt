package com.example.myproject.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.data.local.AppDatabase
import com.example.data.local.dao.NewsDao
import com.example.data.remote.NewsService
import com.example.data.remote.repository.NewsRepositoryImpl
import com.example.domain.repository.NewsRepository
import com.example.myproject.viewmodelfactory.MainViewModelFactory
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class AppModule(val context: Context) {

    @Provides
    fun provideContext(): Context {
        return context
    }

    @Provides
    fun provideMainViewModelFactory(): MainViewModelFactory{
        return MainViewModelFactory()
    }

}
@Module
class DataModule{

    @Provides
    fun provideRepository(newsDao: NewsDao, newsService: NewsService): NewsRepository {
        return NewsRepositoryImpl(newsDao, newsService)
    }


    @Provides
    fun provideAppDatabase(context: Context): AppDatabase{
        return Room.databaseBuilder(context, AppDatabase::class.java, "database").build()
    }

    @Provides
    fun provideNewsDao(database: AppDatabase): NewsDao{
        return database.newsDao()
    }
}
@Module
class NetworkModule {
    @Provides
    fun provideRetrofit(): NewsService {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://newsapi.org")
            .build()
        return retrofit.create(NewsService::class.java)
    }
}