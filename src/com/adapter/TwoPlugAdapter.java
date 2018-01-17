package com.adapter;

/**
 * 将三项接口转换成二项接口
 * 实际上就是初始化适配器时存入一个二项接口的变量，然后在实现三项接口的方法中调用二项接口的方法，
 * Created by hasee on 2018/1/17.
 */
public class TwoPlugAdapter implements ThreePlugIf{

    private GBTwoPlug gbTwoPlug;

    //初始化转换器时将存入一个二项接口
    public TwoPlugAdapter(GBTwoPlug gbTwoPlug) {
        this.gbTwoPlug = gbTwoPlug;
    }

    @Override
    public void powerWithThree() {
        System.out.println("三项接口转二项接口成功！");
        gbTwoPlug.powerWithTwo();
    }
}
