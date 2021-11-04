package com.example.catbrowser.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.catbrowser.R
import com.example.catbrowser.databinding.ActivityMainBinding
import com.example.catbrowser.viewmodel.CatViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<CatViewModel>()
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initViews()

        viewModel.shibes.observe(this) {
            // Here is where your will get the result
            Log.d("MainActivity", "onCreate: $it")
            (binding.rvImages.adapter as ShibeAdapter).updateUrls(it)
        }
    }
}