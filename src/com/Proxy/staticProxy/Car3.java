package com.Proxy.staticProxy;

import com.Proxy.Moveable;

/**
 * Created by hasee on 2018/1/20.
 */
public class Car3 implements Moveable{

    private Moveable moveable;

    public Car3(Moveable moveable){
        this.moveable = moveable;
    }

    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶....");
        moveable.move();
        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶....  汽车行驶时间："
                + (endtime - starttime) + "毫秒！");
    }
}
