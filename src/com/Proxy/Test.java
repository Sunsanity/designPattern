package com.Proxy;

import com.Proxy.Moveable;
import com.Proxy.Proxy;

/**
 * Created by hasee on 2018/1/20.
 */
public class Test {

    /**
     * JDK动态代理实现思路
     * 实现功能：通过Proxy的new ProxyInstance返回代理对象
     * 1.声明一段代理类源码
     * 2.用JDK Compiler API编译源码,产生新的类(代理类)
     * 3.将这个类加载到内存中,用反射调用类的构造方法得到代理对象
     * 4.返回代理对象
     */

    public static void main(String[] args) throws Exception {
        //获取代理类
        Moveable m = (Moveable) Proxy.newProxyInstance(Moveable.class);
        m.move();
    }
}
