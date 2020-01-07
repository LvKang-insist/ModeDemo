package com.example.mode.observe

/**
 * @name DesignModeDemo
 * @class name：com.example.designmodedemo.observe
 * @author 345 QQ:1831712732
 * @time 2020/1/2 21:36
 * @description
 */
/**
 * 主题
 */
interface Subject {
    /**
     * 注册观察者
     */
    fun registerObserver(observer: Observer)

    /**
     * 删除观察者
     */
    fun removeObserver(observer: Observer)

    /**
     * 主题发生改变是，用来通知所有的观察者
     */
    fun notifyObservers()
}

/**
 * 观察者接口，所有的观察者必须实现此接口
 */
interface Observer {
    /**
     * 更新数据
     */
    fun update(temp: Float, humidity: Float, pressure: Float)
}

interface DisplayElement {
    /**
     * 显示数据
     */
    fun display()
}