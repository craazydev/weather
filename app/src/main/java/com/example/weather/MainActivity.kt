package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quotesApi = RetrofitHelper.getInstance().create(WeatherApi::class.java)
        // launching a new coroutine
        GlobalScope.launch {
            val result = quotesApi.getQuotes()
            if (result != null)
            // Checking the results
                Log.d("ayush: ", result.body().toString())
        }

    }
}


//http://api.openweathermap.org/data/2.5/forecast/daily?q=Симферополь&units=metric&cnt=7&lang=ru&appid=c0c4a4b4047b97ebc5948ac9c48c0559