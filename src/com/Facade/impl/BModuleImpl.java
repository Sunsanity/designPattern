package com.Facade.impl;

import com.Facade.BModuleApi;

/**
 * Created by hasee on 2018/1/21.
 */
public class BModuleImpl implements BModuleApi {
    @Override
    public void testB() {
        System.out.println("现在在B模块里面操作testB方法");
    }
}
