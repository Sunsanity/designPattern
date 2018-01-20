package com.Proxy;

import java.lang.reflect.Method;

/**
 * 指定被代理对象和具体的被代理方法
 * Created by hasee on 2018/1/20.
 */
public interface InvocationHandler {

    public void invoke(Object o, Method m);

}
