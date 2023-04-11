package com.example.retrofitactivity

import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.Retrofit

class RetrofitClass {

     lateinit var retrofitInterface: RetrofitInterface
    lateinit var retrofit: Retrofit

    fun getRetrofit() : RetrofitInterface {
        retrofit = Retrofit.Builder()
            .baseUrl("https://gorest.co.in/public/v2/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
        retrofitInterface =  retrofit.create(RetrofitInterface::class.java)
        return retrofitInterface
    }
}