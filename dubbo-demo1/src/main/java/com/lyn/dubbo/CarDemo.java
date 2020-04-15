package com.lyn.dubbo;

import com.lyn.dubbo.spi.Car;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @program: dubbo-2.6.x
 * @author: lyn
 * * @create: 2020-04-06 14:43
 **/
public class CarDemo {
    public static void main(String[] args) {
        ServiceLoader<Car> serviceLoader = ServiceLoader.load(Car.class);
        Iterator<Car> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
//            car.getColor();
        }
    }
}
