package com.example.mode.observable

import com.example.mode.observe.DisplayElement
import java.util.*

/**
 * @name DesignModeDemo
 * @class name：com.example.designmodedemo.observe
 * @author 345 QQ:1831712732
 * @time 2020/1/2 21:53
 * @description
 */
class StatisticsDisplay(private var weatherData: Observable) : Observer,
    DisplayElement {

    var temperature: Float = 0F
    var humidity: Float = 0F
    var pressure: Float = 0F


    init {
        this.weatherData.addObserver(this)
    }

    override fun update(o: Observable?, arg: Any?) {
        if (o is WeatherData) {
            this.temperature = o.temperature
            this.humidity = o.humidity
            this.pressure = o.pressure
        }
        display()
    }

    override fun display() {
        println(
            """
            公告三：
                温度：$temperature
                湿度：$humidity
                压力：$pressure
        """.trimIndent()
        )
    }

}