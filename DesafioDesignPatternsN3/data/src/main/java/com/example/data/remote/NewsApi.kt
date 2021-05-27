package com.example.data.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url

interface NewsApi {
    @GET("v2/everything")
    fun getArticles(
        @Query("apiKey") apiKey: String = "c26a3c60aa3e4a02a946270050ec6aec",
        @Query("page") page: Int,
        @Query("q") q: String
    ): Call<NewsModel>

}