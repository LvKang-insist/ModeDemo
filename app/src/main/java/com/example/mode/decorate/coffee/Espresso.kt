package com.example.mode.decorate.coffee

import com.example.mode.decorate.Beverage

/**
 * @name ModeDemo
 * @class name：com.example.mode.decorate
 * @author 345 QQ:1831712732
 * @time 2020/1/6 21:36
 * @description 被装饰者：浓缩咖啡
 */
class Espresso : Beverage() {


    init {
        mDescription = "浓缩咖啡"
    }

    /**
     * 浓缩咖啡的价格
     */
    override fun cost(): Double {
        return 32.00
    }
}