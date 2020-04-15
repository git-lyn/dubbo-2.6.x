package com.lyn.dubbo.impl;

import com.alibaba.dubbo.common.URL;
import com.lyn.dubbo.spi.Car;

/**
 * @program: dubbo-2.6.x
 * @author: lyn
 * * @create: 2020-04-06 15:15
 **/
public class CarWrapper2 implements Car {

    private Car car;

    public CarWrapper2(Car car) {
        this.car = car;
    }


    @Override
    public void getColor(URL url) {
        System.out.println("before222");
        car.getColor(url);
        System.out.println("after2222");
    }
}
