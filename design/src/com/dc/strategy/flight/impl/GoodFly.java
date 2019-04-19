package com.dc.strategy.flight.impl;

import com.dc.strategy.flight.FlightInterface;

/**
 * @author: dong.chao
 * @create: 2019-04-16 11:32
 * @description: 好的飞行
 **/
public class GoodFly  implements FlightInterface {
    @Override
    public void fly() {
        System.out.println("好好飞行一下呀");
    }
}
