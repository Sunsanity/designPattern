package com.strategy;

import com.strategy.impl.FlyNoWay;

/**
 * Created by hasee on 2018/1/19.
 */
public class RedheadDuck extends Duck {

    //构造对象时设置鸭子的飞行策略方式  此处表现出策略模式中客户端必须要清楚每一种算法的具体细节
    public RedheadDuck(){
        super();
        super.setFlyingStragety(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我的头是红色的");
    }
}
