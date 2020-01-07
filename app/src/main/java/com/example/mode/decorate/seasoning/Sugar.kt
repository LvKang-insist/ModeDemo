package com.example.mode.decorate.seasoning

import com.example.mode.decorate.Beverage

/**
 * @name ModeDemo
 * @class name：com.example.mode.decorate.seasoning
 * @author 345 QQ:1831712732
 * @time 2020/1/6 21:55
 * @description 装饰者：糖
 */
class Sugar(private var beverage: Beverage) : CondimentDecorator() {
    override fun setCondiment(condiment: CondimentDecorator) {
        beverage = condiment
    }

    /**
     * 描述
     */
    override fun getDescription(): String {
        return beverage.getDescription() + "，糖"
    }

    /**
     * 价格
     */
    override fun cost(): Double {
        return 4.00 + beverage.cost()
    }
}