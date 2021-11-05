package com.example.catbrowser.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.catbrowser.databinding.ActivityDetailBinding
import com.example.catbrowser.extensions.loadUrl

class DetailActivity : AppCompatActivity() {

    private val binding by lazy { ActivityDetailBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Retrieve MainActivity Intents and declare variables
        val catName = intent.getStringExtra("CAT_NAME")
        val catImageUrl = intent.getStringExtra("CAT_IMAGE")
        val catDescription = intent.getStringExtra("CAT_DESCRIPTION")
        val catOrigin = intent.getStringExtra("CAT_ORIGIN")
        val catTemperaments = intent.getStringExtra("CAT_TEMPERAMENTS")
        val catLifeSpan = intent.getStringExtra("LIFE_SPAN")
        val catIndoor = intent.getStringExtra("INDOOR")
        val catLap = intent.getStringExtra("LAP")

        // Implement Intents into this Detail Activity
        binding.catName.text = catName
        if (catImageUrl != null) {
            binding.catImage.loadUrl(catImageUrl)
        }
        binding.catDescription.text = catDescription
        binding.catOrigin.text = "Origin: ${catOrigin}"
        binding.catTemperaments.text = "Temperaments: ${catTemperaments}"
        binding.catLifeSpan.text = "Life Span: ${catLifeSpan}"
        binding.catIndoor.text = "Indoor - ${if(catIndoor !== null) catIndoor else "N/A"}"
        binding.catLap.text = "Lap - ${catLap}"

    }
}