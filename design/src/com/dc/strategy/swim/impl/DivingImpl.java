package com.dc.strategy.swim.impl;

import com.dc.strategy.swim.SwimInterface;

/**
 * @author: dong.chao
 * @create: 2019-04-16 13:44
 * @description: 潜水
 **/
public class DivingImpl implements SwimInterface {

    @Override
    public void swim() {
        System.out.println("潜水");
    }
}
