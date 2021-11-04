package com.example.catbrowser.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.catbrowser.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private val binding by lazy { ActivityDetailBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val catDescription = intent.getStringExtra("CAT_DESCRIPTION")
        binding.catDetails.text = catDescription
    }
}