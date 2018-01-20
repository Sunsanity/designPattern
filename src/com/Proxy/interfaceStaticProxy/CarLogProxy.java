package com.Proxy.interfaceStaticProxy;

import com.Proxy.Moveable;

/**
 * Created by hasee on 2018/1/20.
 */
public class CarLogProxy implements Moveable {

    private Moveable moveable;

    public CarLogProxy(Moveable moveable){
        this.moveable = moveable;
    }

    @Override
    public void move() {
        System.out.println("日志开始....");
        moveable.move();
        System.out.println("日志结束....");
    }
}
