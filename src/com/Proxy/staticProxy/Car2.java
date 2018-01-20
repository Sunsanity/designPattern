package com.Proxy.staticProxy;

/**
 * 继承方式实现代理，不利于今后的维护，一旦新增一种代理，或者修改代理的顺序就需要重新写一个代理类
 * Created by hasee on 2018/1/20.
 */
public class Car2 extends Car{

    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶....");
        super.move();
        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶....  汽车行驶时间："
                + (endtime - starttime) + "毫秒！");
    }
}
