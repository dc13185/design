package com.dc.test;

import com.dc.strategy.basic.AbstractDuck;
import com.dc.strategy.context.FlySwimDuck;
import com.dc.strategy.context.RocketDuck;

/**
 * @author: dong.chao
 * @create: 2019-04-16 14:49
 * @description: 策略模式
 **/
public class StrategyTest {

    public static void main(String[] args) {
        AbstractDuck ce = new FlySwimDuck();
        ce.fly();
        ce.swim();

        AbstractDuck  ic = new RocketDuck();
        ic.fly();
        ic.swim();

    }
}
