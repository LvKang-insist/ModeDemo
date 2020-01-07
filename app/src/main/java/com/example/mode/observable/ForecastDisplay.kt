package com.example.mode.observable

import com.example.mode.observe.DisplayElement
import java.util.*
import java.util.Observer

/**
 * @name DesignModeDemo
 * @class name：com.example.designmodedemo.observe
 * @author 345 QQ:1831712732
 * @time 2020/1/2 21:53
 * @description
 */
class ForecastDisplay(private var weatherData: Observable) : Observer,
    DisplayElement {

    private var temperature: Float = 0F
    private var pressure: Float = 0F


    init {
        this.weatherData.addObserver(this)
    }

    override fun update(o: Observable?, arg: Any?) {
        if (o is WeatherData) {
            this.temperature = o.temperature
            this.pressure = o.pressure
        }
        display()
    }


    override fun display() {
        println(
            """
            公告二：
                温度：$temperature
                压力：$pressure
        """.trimIndent()
        )
    }

}