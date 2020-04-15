package com.lyn.dubbo.impl;

import com.alibaba.dubbo.common.URL;
import com.lyn.dubbo.spi.Car;

/**
 * @program: dubbo-2.6.x
 * @author: lyn
 * * @create: 2020-04-06 15:24
 **/
public class BenzCar implements Car {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public void getColor(URL url) {
        System.out.println("奔驰很不错");
        car.getColor(url);
    }
}
