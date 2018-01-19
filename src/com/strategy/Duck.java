package com.strategy;

/**
 * 所有鸭子的抽象父类
 * Created by hasee on 2018/1/19.
 */
public abstract class Duck {

    //鸭子叫声，子类可以复写自己的叫声
    public void quack(){
        System.out.println("嘎嘎嘎");
    }

    //鸭子的显示方式，不同鸭子展示方式不一样，由子类实现细节
    public abstract void display();

    //保存飞行接口变量，用于鸭子的飞行行为
    private FlyingStragety flyingStragety;

    public void setFlyingStragety(FlyingStragety flyingStragety){
        this.flyingStragety = flyingStragety;
    }

    //鸭子飞行实际调用的是飞行接口实现类的飞行方法
    public void fly(){
        flyingStragety.performFly();
    }
}
