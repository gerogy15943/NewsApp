package com.example.myproject.app

import android.app.Application
import com.example.myproject.di.AppComponent
import com.example.myproject.di.AppModule
import com.example.myproject.di.DaggerAppComponent



class App: Application(){

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}