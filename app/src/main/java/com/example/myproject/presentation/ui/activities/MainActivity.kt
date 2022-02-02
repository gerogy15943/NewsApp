package com.example.myproject.presentation.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myproject.R
import com.example.myproject.app.App
import com.example.myproject.di.AppComponent
import com.example.myproject.di.AppModule
import com.example.myproject.di.DaggerAppComponent
import com.example.myproject.presentation.ui.fragments.main.MainFragment

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

    }
}