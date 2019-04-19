package com.dc.strategy.flight.impl;

import com.dc.strategy.flight.FlightInterface;

/**
 * @author: dong.chao
 * @create: 2019-04-16 13:38
 * @description: 不能飞行
 **/
public class NotFly implements FlightInterface {

    @Override
    public void fly() {
        System.out.println("不能飞");
    }
}
