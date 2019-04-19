package com.dc.strategy.flight.impl;

import com.dc.strategy.flight.FlightInterface;

/**
 * @author: dong.chao
 * @create: 2019-04-16 11:33
 * @description: 搭乘飞行器飞行
 **/
public class EjectorFly implements FlightInterface {
    @Override
    public void fly() {
        System.out.println("搭乘飞行器");
    }
}
