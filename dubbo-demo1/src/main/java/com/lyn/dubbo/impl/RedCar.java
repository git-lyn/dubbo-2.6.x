package com.lyn.dubbo.impl;

import com.alibaba.dubbo.common.URL;
import com.lyn.dubbo.spi.Car;

/**
 * @program: dubbo-2.6.x
 * @author: lyn
 * * @create: 2020-04-06 14:42
 **/
public class RedCar implements Car {
    @Override //
    public void getColor(URL url) {
        System.out.println("red &&&&&&");
    }
}
