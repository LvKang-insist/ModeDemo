package com.example.mode.decorate.seasoning

import com.example.mode.decorate.Beverage

/**
 * @name ModeDemo
 * @class name：com.example.mode.decorate.seasoning
 * @author 345 QQ:1831712732
 * @time 2020/1/6 21:46
 * @description 装饰者：牛奶
 */
class Milk(private var beverage: Beverage) : CondimentDecorator() {

    override fun setCondiment(condiment: CondimentDecorator) {
        beverage = condiment
    }


    override fun getDescription(): String {
        return beverage.getDescription() + "，牛奶"
    }

    /**
     * 价格
     */
    override fun cost(): Double {
        return 5.00 + beverage.cost()
    }

}