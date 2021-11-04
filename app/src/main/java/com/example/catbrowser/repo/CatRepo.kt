package com.example.catbrowser.repo

import com.example.catbrowser.model.Breed
import com.example.catbrowser.repo.remote.RetrofitInstance
import retrofit2.Response

object CatRepo {

    suspend fun getBreeds(): Response<List<Breed>> {
        return RetrofitInstance.catService.getBreeds()
    }
}