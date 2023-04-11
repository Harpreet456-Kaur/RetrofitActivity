package com.example.retrofitactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var retrofitClass: RetrofitClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var retrofitClass : Call<RetrofitUserResponse> = RetrofitClass().getRetrofit().getUserInfo()
        retrofitClass.enqueue(object: Callback<RetrofitUserResponse> {
            override fun onResponse(
                call: Call<RetrofitUserResponse>,
                response: Response<RetrofitUserResponse>
            ) {
                System.out.println("in response body ${response.body()}")
                System.out.println("in response ${response}")
                var retrofitUserResponse = response.body()
                System.out.println("retrofitUserResponse ${retrofitUserResponse?.id}")
            }

            override fun onFailure(call: Call<RetrofitUserResponse>, t: Throwable) {
                System.out.println("In failure ${t.message}")
            }
        })
    }
}


