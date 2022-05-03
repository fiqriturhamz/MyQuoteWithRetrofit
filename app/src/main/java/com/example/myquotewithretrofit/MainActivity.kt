package com.example.myquotewithretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myquotewithretrofit.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response

import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val client = ApiConfig.getApiService().getQuote()
        client.enqueue(object :Callback<RandomResponse>, retrofit2.Callback<RandomResponse> {
            override fun onResponse(
                call: Call<RandomResponse>,
                response: Response<RandomResponse>
            ) {
                if (response.isSuccessful){
                    val responseBody = response.body()
                    if(responseBody != null{
                        binding.tvQuote.text = responseBody.
                    }
                }
            }

            override fun onFailure(call: Call<RandomResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}