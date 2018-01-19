package com.strategy;

import com.strategy.impl.FlyNoWay;

/**
 * Created by hasee on 2018/1/19.
 */
public class RubberDuck extends Duck {

    public RubberDuck(){
        super();
        super.setFlyingStragety(new FlyNoWay());
    }

    public void quack(){
        System.out.println("嘎~嘎~嘎~");
    }

    @Override
    public void display() {
        System.out.println("我全身发黄，嘴巴很红");
    }
}
