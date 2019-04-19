package com.dc.strategy.swim.impl;

import com.dc.strategy.swim.SwimInterface;

/**
 * @author: dong.chao
 * @create: 2019-04-16 13:46
 * @description: 游泳很快的类
 **/
public class SwimFast implements SwimInterface {

    @Override
    public void swim() {
        System.out.println("游泳速度很快");
    }
}
