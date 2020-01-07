package com.example.mode.observe

/**
 * @name DesignModeDemo
 * @class name：com.example.designmodedemo.observe
 * @author 345 QQ:1831712732
 * @time 2020/1/2 21:53
 * @description
 */
class ForecastDisplay(private var weatherData: Subject) : Observer,
    DisplayElement {

    var temperature: Float = 0F
    var pressure: Float = 0F

    init {
        this.weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        temperature = temp
        this.pressure = pressure
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