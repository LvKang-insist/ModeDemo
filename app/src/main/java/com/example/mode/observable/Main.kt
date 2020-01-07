package com.example.mode.observable;

/**
 * @author 345 QQ:1831712732
 * @name DesignModeDemo
 * @class name：com.example.mode.observable
 * @time 2020/1/2 22:42
 * @description
 */

fun main() {
    val weatherData = WeatherData()

    CurrentConditionsDisplay(weatherData)
    ForecastDisplay(weatherData)
    StatisticsDisplay(weatherData)

    weatherData.setMeasurements(23123f, 4.43f, 34f)
}