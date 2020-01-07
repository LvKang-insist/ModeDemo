package com.example.mode.observe

/**
 * @name DesignModeDemo
 * @class name：com.example.designmodedemo.observe
 * @author 345 QQ:1831712732
 * @time 2020/1/2 21:53
 * @description
 */
class CurrentConditionsDisplay(weatherData: Subject) : Observer,
    DisplayElement {

    var temperature: Float = 0F
    var humidity: Float = 0F
    private var weatherData: Subject = weatherData

    init {
        this.weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        temperature = temp
        this.humidity = humidity
        display()
    }

    override fun display() {
        println(
            """
            公告一：
                温度：$temperature
                湿度：$humidity
        """.trimIndent()
        )
    }

}