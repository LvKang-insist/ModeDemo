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
class CurrentConditionsDisplay(private var weatherData: Observable) : Observer,
    DisplayElement {

    private var temperature: Float = 0F
    private var humidity: Float = 0F

    init {
        this.weatherData.addObserver(this)
    }

    override fun update(o: Observable?, arg: Any?) {
        if (o is WeatherData) {
            this.temperature = o.temperature
            this.humidity = o.humidity
        }
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
