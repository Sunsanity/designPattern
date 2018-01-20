package com.Proxy.interfaceStaticProxy;

/**
 *
 * 通过聚合的方式实现静态代理具有更强的灵活性，有需要改变代理功能的顺序时不需要新增类实现，只需要更换客户端代理代码的顺序即可
 * Created by hasee on 2018/1/20.
 */
public class Client {

    public static void main(String[] args) {
        Car car = new Car();
        CarLogProxy logProxy = new CarLogProxy(car);
        CarTimeProxy timeProxy = new CarTimeProxy(logProxy);
        timeProxy.move();
    }
}
