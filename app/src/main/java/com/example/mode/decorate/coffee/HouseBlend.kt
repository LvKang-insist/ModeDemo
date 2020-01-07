package com.example.mode.decorate.coffee

import com.example.mode.decorate.Beverage

/**
 * @author 345 QQ:1831712732
 * @name ModeDemo
 * @class name：com.example.mode.decorate
 * @time 2020/1/6 21:38
 * @description 被装饰者：混合咖啡
 */
class HouseBlend : Beverage() {

    init {
        mDescription = "混合咖啡"
    }


    override fun cost(): Double {
        return 50.00
    }

}
