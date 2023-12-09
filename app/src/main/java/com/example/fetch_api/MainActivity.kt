package com.example.fetch_api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.fetch_api.api.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    val morty = findViewById<RecyclerView>(R.id.rv_morty)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ApiConfig.getService().getMorty().enqueue(object :
        Callback<ResponseMorty>{
            override fun onResponse(call: Call<ResponseMorty>, response: Response<ResponseMorty>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<ResponseMorty>, t: Throwable) {
                Toast.makeText(applicationContext, t.localizedMessage,
                    Toast.LENGTH_SHORT).show()
            }
        })
    }
}