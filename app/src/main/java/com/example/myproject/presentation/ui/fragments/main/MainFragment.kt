package com.example.myproject.presentation.ui.fragments.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.domain.repository.NewsRepository
import com.example.myproject.R
import com.example.myproject.app.App
import com.example.myproject.presentation.ui.activities.MainActivity
import javax.inject.Inject

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    @Inject
    lateinit var repository: NewsRepository

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        (context?.applicationContext as App).appComponent.inject(this)
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.srtValue.observe(this, Observer {
            Log.d("TAG", it)
        })
        viewModel.get(repository)
        // TODO: Use the ViewModel
    }

}