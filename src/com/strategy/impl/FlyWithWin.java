package com.strategy.impl;

import com.strategy.FlyingStragety;

/**
 * 飞行策略接口实现类
 * Created by hasee on 2018/1/19.
 */
public class FlyWithWin implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("振翅高飞");
    }
}
