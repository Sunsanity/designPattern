package com.singleton;

/**
 * 单例模式
 * Created by hasee on 2018/1/17.
 */
public class Singleton {

    private Singleton() {}  //私有构造函数，不允许外界构造

    //volatile的使用防止instance = new singleton();这句因为指令重排序原因导致返回的实例是一个未初始化的对象
    private volatile static Singleton instance = null;  //单例对象


    //静态工厂方法
    public static Singleton getInstance() {
        if (instance == null) {      //双重检测机制，这层检测出于synchronized的性能原因考虑，否则即使instance不为空，所有线程还是需要同步执行
            synchronized (Singleton.class){  //同步锁
                if (instance == null) {     //双重检测机制，这层检测用于使instance = new singleton();同步执行，保证同步安全，不会初始化多个对象
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
