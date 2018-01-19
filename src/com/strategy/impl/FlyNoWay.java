package com.strategy.impl;

import com.strategy.FlyingStragety;

/**
 * 飞行接口实现类
 * Created by hasee on 2018/1/19.
 */
public class FlyNoWay implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("我不会飞行！");
    }
}
