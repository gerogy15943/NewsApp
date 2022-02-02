package com.example.myproject.presentation.ui.fragments.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.data.remote.model.News
import com.example.domain.repository.NewsRepository
import javax.inject.Inject

class MainViewModel : ViewModel() {
    val resultValue = MutableLiveData<List<News>>()
    val srtValue = MutableLiveData<String>()

    @Inject
    fun get(repository: NewsRepository){
        val list = repository.getNews()
        srtValue.value = list.toString()
    }
}
