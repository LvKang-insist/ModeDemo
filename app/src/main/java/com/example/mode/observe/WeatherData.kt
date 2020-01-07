package com.example.mode.observe

/**
 * @name DesignModeDemo
 * @class name：com.example.designmodedemo.observe
 * @author 345 QQ:1831712732
 * @time 2020/1/2 21:43
 * @description 主题的实现类
 */

class WeatherData : Subject {

    private var observers: MutableList<Observer> = mutableListOf()
    private var temperature: Float = 0F
    private var humidity: Float = 0F
    private var pressure: Float = 0F

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update(temperature, humidity, pressure)
        }
    }

    fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temp: Float, humidity: Float, pressure: Float) {
        temperature = temp
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

}