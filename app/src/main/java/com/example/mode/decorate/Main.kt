package com.example.mode.decorate

import com.example.mode.decorate.coffee.Espresso
import com.example.mode.decorate.coffee.HouseBlend
import com.example.mode.decorate.seasoning.CondimentDecorator
import com.example.mode.decorate.seasoning.Milk
import com.example.mode.decorate.seasoning.Sugar
import com.example.mode.decorate.seasoning.Whip
import java.lang.Exception

/**
 * @name DesignModeDemo
 * @class name：com.example.mode.decorate
 * @author 345 QQ:1831712732
 * @time 2020/1/6 22:00
 * @description
 */

fun main() {

    /**
     * 一杯杯混合咖啡，加牛奶，两份奶油
     */
    val whip = Whip(Whip(Milk(HouseBlend())))
    println(whip.getDescription() + "    ￥" + whip.cost())

    val houseBlend = HouseBlend()
    val listOf = mutableListOf<CondimentDecorator>()
    //两份奶油，一份牛奶
    listOf += Whip(houseBlend)
    listOf += Whip(houseBlend)
    listOf += Milk(houseBlend)

    for (i in 0 until listOf.size) {
        if (i < listOf.size - 1) {
            listOf[i].setCondiment(listOf[i + 1])
        }
    }
    println(listOf[0].getDescription() + "    ￥" + listOf[0].cost())
    //取消一个牛奶，这里可以直接删除引用
    listOf.removeAt(0)
    println(listOf[0].getDescription() + "    ￥" + listOf[0].cost())
}