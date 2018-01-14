package com.observer;

/**
 * 主题（发布者、被观察者）
 * Created by hasee on 2018/1/14.
 */
public interface Subject {

    /**
     * 注册观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();

}
