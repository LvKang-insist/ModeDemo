package com.example.mode.observable

import java.util.*

/**
 * @name DesignModeDemo
 * @class name：com.example.designmodedemo.observable
 * @author 345 QQ:1831712732
 * @time 2020/1/2 22:17
 * @description
 */
class WeatherData : Observable() {

    var temperature: Float = 0F
    var humidity: Float = 0F
    var pressure: Float = 0F


    private fun measurementsChanged() {
        //在 notify 之前，必须调用 setChanged 表示状态发生改变
        setChanged()
        notifyObservers()
    }

    fun setMeasurements(temp: Float, hum: Float, press: Float) {
        temperature = temp
        humidity = hum
        pressure = press
        measurementsChanged()
    }

}