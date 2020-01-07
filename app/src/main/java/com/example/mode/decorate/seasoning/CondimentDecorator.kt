package com.example.mode.decorate.seasoning

import com.example.mode.decorate.Beverage

/**
 * @name ModeDemo
 * @class name：com.example.mode.decorate
 * @author 345 QQ:1831712732
 * @time 2020/1/6 21:33
 * @description 装饰者类(调料)，例如给咖啡添加牛奶，糖等，需要继承此类
 */
abstract class CondimentDecorator : Beverage() {

    /**
     * 调料的描述
     */
    abstract override fun getDescription(): String

    abstract fun setCondiment(condiment: CondimentDecorator)
}