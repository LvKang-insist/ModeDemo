package com.example.mode.decorate

/**
 * @name ModeDemo
 * @class name：com.example.mode.decorate
 * @author 345 QQ:1831712732
 * @time 2020/1/6 21:29
 * @description 饮料
 */

abstract class Beverage {
    /**
     * 未知的饮料
     */
    var mDescription = "Unknown Beverage"

    /**
     * 获取饮料描述
     */
    open fun getDescription(): String {
        return mDescription
    }

    /**
     * 计算价格
     */
    abstract fun cost(): Double
}