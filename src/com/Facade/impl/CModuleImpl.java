package com.Facade.impl;

import com.Facade.CModuleApi;

/**
 * Created by hasee on 2018/1/21.
 */
public class CModuleImpl implements CModuleApi {
    @Override
    public void testC() {
        System.out.println("现在在C模块里面操作testC方法");
    }
}
