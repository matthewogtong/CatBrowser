package com.example.catbrowser.repo

import com.example.catbrowser.repo.remote.RetrofitInstance
import retrofit2.Response

object CatRepo {

    suspend fun getImages(count: Int): Response<List<String>> {
        return RetrofitInstance.catService.getImages(count, urls = true, httpsUrls = true)
    }
}