package com.example.mode.observe

/**
 * @name DesignModeDemo
 * @class name：com.example.designmodedemo.observe
 * @author 345 QQ:1831712732
 * @time 2020/1/2 21:53
 * @description
 */
class StatisticsDisplay(private var weatherData: Subject) : Observer,
    DisplayElement {

    var temperature: Float = 0F
    var humidity: Float = 0F
    var pressure: Float = 0F

    init {
        this.weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        temperature = temp
        this.humidity = humidity
        this.pressure = pressure
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