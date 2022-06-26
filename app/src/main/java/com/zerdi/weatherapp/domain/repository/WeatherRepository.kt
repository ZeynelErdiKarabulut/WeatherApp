package com.zerdi.weatherapp.domain.repository

import com.zerdi.weatherapp.domain.util.Resource
import com.zerdi.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}