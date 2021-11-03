package com.example.catbrowser.repo.remote

import android.service.carrier.CarrierService
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitInstance {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://thecatapi.com")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val CatService: CarrierService = retrofit.create(CatService::class.java)
}