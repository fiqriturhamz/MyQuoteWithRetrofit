package com.example.myquotewithretrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("random")
    fun getQuote(): Call<RandomResponse>
}