package com.example.catbrowser.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.catbrowser.R
import com.example.catbrowser.adapter.CatAdapter
import com.example.catbrowser.databinding.ActivityMainBinding
import com.example.catbrowser.databinding.ItemImageBinding
import com.example.catbrowser.viewmodel.CatViewModel
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<CatViewModel>()
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initViews()

        viewModel.breeds.observe(this) {
            // Here is where your will get the result
            Log.d("give me names", it[0].name.toString())
            (binding.rvImages.adapter as CatAdapter).updateBreeds(it)
        }

        // onCreate Variables

    }

    private fun initViews() = with(binding) {
        btnFetch.setOnClickListener {

            viewModel.getBreeds()
        }
        rvImages.adapter = CatAdapter()
        swSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            (rvImages.layoutManager as GridLayoutManager).spanCount = if (isChecked) 2 else 1
            buttonView.text =
                if (isChecked) getString(R.string.grid) else getString(R.string.linear)

        }
    }

}