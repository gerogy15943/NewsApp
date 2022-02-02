package com.example.myproject.di

import com.example.myproject.presentation.ui.activities.MainActivity
import com.example.myproject.presentation.ui.fragments.main.MainFragment
import dagger.Component

@Component(modules = [AppModule::class, NetworkModule::class, DataModule::class])
interface AppComponent {
    fun inject(mainFragment: MainFragment)

}