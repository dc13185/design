package com.dc.strategy.basic;

import com.dc.strategy.flight.FlightInterface;
import com.dc.strategy.swim.SwimInterface;

/**
 * @author: dong.chao
 * @create: 2019-04-16 10:11
 * @description: 策略模式/鸭子基础类
 **/
public abstract class AbstractDuck {

    private FlightInterface flight;

    private SwimInterface swim;


    public void setFlight(FlightInterface flight) {
        this.flight = flight;
    }

    public void setSwim(SwimInterface swim) {
        this.swim = swim;
    }

    public void quack(){
        System.out.println("鸭子鸭子 嘎嘎叫");
    }

    public abstract void display();

    public void swim() {
        swim.swim();
    }

    public void fly() {
        flight.fly();
    }



}
