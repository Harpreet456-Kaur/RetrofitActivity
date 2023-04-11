package com.example.retrofitactivity

import com.squareup.moshi.Json

class RetrofitUserResponse (

    @Json(name = "email")
    val email: String? = null, // prajapat_agastya@labadie.info
    @Json(name = "gender")
    val gender: String? = null, // male
    @Json(name = "id")
    val id: Int? = null, // 495
    @Json(name = "name")
    val name: String? = null, // Agastya Prajapat
    @Json(name = "status")
    val status: String? = null

)
