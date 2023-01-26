package com.example.weather

import com.example.weather.model.WeatherList
import retrofit2.Response
import retrofit2.http.GET


interface WeatherApi {
    @GET("/data/2.5/forecast/daily?q=Симферополь&units=metric&cnt=7&lang=ru&appid=c0c4a4b4047b97ebc5948ac9c48c0559")
    suspend fun getQuotes(): Response<WeatherList>
}

//http://api.openweathermap.org/data/2.5/forecast/daily?q=Симферополь&units=metric&cnt=7&lang=ru&appid=c0c4a4b4047b97ebc5948ac9c48c0559