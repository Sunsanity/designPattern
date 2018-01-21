package com.Facade;

import com.Facade.impl.AModuleImpl;
import com.Facade.impl.BModuleImpl;
import com.Facade.impl.CModuleImpl;

/**
 * 外观对象
 * 客户端只需要调用这个外观对象，不需要再和子系统之间产生耦合
 * Created by hasee on 2018/1/21.
 */
public class Facade {

    /**
     * 示意方法，满足客户需要的功能
     */
    public void test(){
        //在内部实现的时候，可能会调用到内部的多个模块
        AModuleApi a = new AModuleImpl();
        a.testA();
        BModuleApi b = new BModuleImpl();
        b.testB();
        CModuleApi c = new CModuleImpl();
        c.testC();
    }

}
