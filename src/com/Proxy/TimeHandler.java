package com.Proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by hasee on 2018/1/20.
 */
public class TimeHandler implements InvocationHandler{

    //被代理对象
    private Object target;

    public TimeHandler(Object target){
        super();
        this.target = target;
    }

    @Override
    public void invoke(Object o, Method m) {

        try {
            long starttime = System.currentTimeMillis();
            System.out.println("汽车开始行驶....");
            m.invoke(target);
            long endtime = System.currentTimeMillis();
            System.out.println("汽车结束行驶....  汽车行驶时间："
                    + (endtime - starttime) + "毫秒！");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
