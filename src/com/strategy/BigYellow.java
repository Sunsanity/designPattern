package com.strategy;

import com.strategy.impl.FlyNoWay;

/**
 * Created by hasee on 2018/1/19.
 */
public class BigYellow extends Duck {

    public BigYellow(){
        super();
        super.setFlyingStragety(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我身体很大，全身黄黄");
    }
}
