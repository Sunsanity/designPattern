package com.modelMethod;

/**
 * Created by hasee on 2018/1/17.
 */
public class Tea extends RefreshBeverage{


    @Override
    protected void brew() {
        System.out.println("用80度的热水浸泡茶叶5分钟");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    @Override
	/*
	 * 子类通过覆盖的形式选择挂载钩子函数
	 * @see com.imooc.pattern.template.RefreshBeverage#isCustomerWantsCondiments()
	 */
    protected boolean isCustomerWantsCondiments(){
        return false;
    }
}
