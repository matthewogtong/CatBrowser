package com.example.catbrowser.repo.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CatService {

    @GET("api/cats")
    suspend fun getImages(
        @Query("count") count: Int,
        @Query("urls") urls: Boolean,
        @Query("httpsUrls") httpsUrls: Boolean,
    ): Response<List<String>>
}
