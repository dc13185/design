package com.dc.strategy.context;

import com.dc.strategy.basic.AbstractDuck;
import com.dc.strategy.flight.impl.EjectorFly;
import com.dc.strategy.swim.impl.DivingImpl;

/**
 * @author: dong.chao
 * @create: 2019-04-16 14:24
 * @description: 火箭鸭子
 **/
public class RocketDuck extends AbstractDuck {

    public RocketDuck() {
        this.setFlight(new EjectorFly());
        this.setSwim(new DivingImpl());
    }

    @Override
    public void display() {
        System.out.println("火箭鸭很小");
    }
}
