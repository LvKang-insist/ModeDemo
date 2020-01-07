package com.example.mode.observe

/**
 * @author 345 QQ:183171732
 * @name DesignModeDemo
 * @class name：com.example.designmodedemo.observe
 * @time 2020/1/2 21:35
 * @description
 */
fun main() {

    val weatherData = WeatherData()

    //创建三个公告板的对象
    CurrentConditionsDisplay(weatherData)
    ForecastDisplay(weatherData)
    StatisticsDisplay(weatherData)

    weatherData.setMeasurements(23f, 4.43f, 34f)
}
