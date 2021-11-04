package com.example.catbrowser.repo.remote

import com.example.catbrowser.model.Breed
import retrofit2.Response
import retrofit2.http.GET

interface CatService {

    @GET("v1/breeds/")
    suspend fun getBreeds(): Response<List<Breed>>
}
