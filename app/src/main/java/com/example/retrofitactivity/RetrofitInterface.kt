package com.example.retrofitactivity

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {

    @GET("users/495")
    fun  getUserInfo(): Call<RetrofitUserResponse>
}