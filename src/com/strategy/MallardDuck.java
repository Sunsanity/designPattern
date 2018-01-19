package com.strategy;

import com.strategy.impl.FlyWithWin;

/**
 * Created by hasee on 2018/1/19.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        super();
        super.setFlyingStragety(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是绿色的");
    }
}
