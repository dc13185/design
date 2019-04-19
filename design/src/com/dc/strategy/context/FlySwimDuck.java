package com.dc.strategy.context;

import com.dc.strategy.basic.AbstractDuck;
import com.dc.strategy.flight.impl.GoodFly;
import com.dc.strategy.swim.impl.SwimFast;

/**
 * @author: dong.chao
 * @create: 2019-04-16 14:07
 * @description: 飞行游泳鸭
 **/
public class FlySwimDuck extends AbstractDuck {

    public FlySwimDuck() {
        this.setFlight(new GoodFly());
        this.setSwim(new SwimFast());
    }

    @Override
    public void display() {
        System.out.println("能飞的鸭子很大只");
    }
}
