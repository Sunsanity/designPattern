package com.Proxy.staticProxy;

import com.Proxy.Moveable;

import java.util.Random;

/**
 * 被代理对象实现moveable接口实现驾驶功能
 * Created by hasee on 2018/1/20.
 */
public class Car implements Moveable{

    @Override
    public void move() {
        //实现开车
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
