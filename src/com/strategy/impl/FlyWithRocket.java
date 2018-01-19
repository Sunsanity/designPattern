package com.strategy.impl;

import com.strategy.FlyingStragety;

/**
 * Created by hasee on 2018/1/19.
 */
public class FlyWithRocket implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("用火箭在太空遨游");
    }
}
