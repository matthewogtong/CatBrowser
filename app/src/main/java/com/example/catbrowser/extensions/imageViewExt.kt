package com.example.catbrowser.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.catbrowser.model.Breed

fun ImageView.loadUrl(url: String) {
    Glide.with(this).load(url).into(this)
}