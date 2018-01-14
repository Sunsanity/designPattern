package com.observer;

/**
 * Created by hasee on 2018/1/14.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{

    //持有主体对象
    private WeatherData weatherData;

    //主体状态变量
    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压

    //初始化观察者对象时将此对象注册到指定的主体列表中
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    //展示主体最新状态信息
    @Override
    public void display() {
        System.out.println("当前温度为：" + this.temperature + "℃");
        System.out.println("当前湿度为：" + this.humidity);
        System.out.println("当前气压为：" + this.pressure);
    }

    //获取主体对象最新状态信息
    @Override
    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        this.pressure = this.weatherData.getPressure();
        display();
    }
}
