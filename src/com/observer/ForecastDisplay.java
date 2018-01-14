package com.observer;

import java.util.List;

/**
 * Created by hasee on 2018/1/14.
 */
public class ForecastDisplay implements Observer,DisplayElement {

    //持有主体对象
    private WeatherData weatherData;

    //初始化观察者对象时将此对象注册到指定的主体列表中
    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    private List<Float> forecastTemperatures;//未来几天的温度

    //展示主体最新状态信息
    @Override
    public void display() {
        System.out.println("未来几天的气温");
        int count = forecastTemperatures.size();
        for (int i = 0; i < count; i++) {
            System.out.println("第" + i + "天:" + forecastTemperatures.get(i) + "℃");
        }
    }

    //获取主体对象最新状态信息
    @Override
    public void update() {
        this.forecastTemperatures = this.weatherData.getForecastTemperatures();
        display();
    }
}
