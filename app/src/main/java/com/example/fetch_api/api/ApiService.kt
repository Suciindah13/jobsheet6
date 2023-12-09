package com.example.fetch_api.api

import com.example.fetch_api.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET ("character")
    fun getMorty(): Call<ResponseMorty>
}