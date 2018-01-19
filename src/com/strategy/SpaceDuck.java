package com.strategy;

import com.strategy.impl.FlyWithRocket;

/**
 * Created by hasee on 2018/1/19.
 */
public class SpaceDuck extends Duck {

    public SpaceDuck(){
        super();
        super.setFlyingStragety(new FlyWithRocket());
    }

    public void quack(){
        System.out.println("我通过无线电与你通信");
    }

    @Override
    public void display() {
        System.out.println("我头戴宇航头盔");
    }
}
