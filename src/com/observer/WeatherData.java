package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasee on 2018/1/14.
 */
public class WeatherData implements Subject {

    private List<Observer> observers;

    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压
    private List<Float> forecastTemperatures;//未来几天的温度

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    //观察者注册
    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    //移除观察者
    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    //通知观察者
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    //更新主体状态
    public void setMeasurements(float temperature, float humidity,
                                float pressure, List<Float> forecastTemperatures) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.forecastTemperatures = forecastTemperatures;
        measurementsChanged();
    }

    //主体状态更新后通知所有观察者
    public void measurementsChanged() {
        notifyObservers();
    }


    //以下用于观察者获取主体最新状态信息方法
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public List<Float> getForecastTemperatures() {
        return forecastTemperatures;
    }

}
