package com.example.mode.decorate.seasoning

import com.example.mode.decorate.Beverage

/**
 * @name ModeDemo
 * @class name：com.example.mode.decorate.seasoning
 * @author 345 QQ:1831712732
 * @time 2020/1/6 21:58
 * @description 装饰者：奶油
 */
class Whip(private var beverage: Beverage) : CondimentDecorator() {
    override fun setCondiment(condiment: CondimentDecorator) {
        beverage = condiment
    }

    override fun getDescription(): String {
        return beverage.getDescription() + ",奶油"
    }

    /**
     * jia价格
     */
    override fun cost(): Double {
        return 6.00 + beverage.cost()
    }
}