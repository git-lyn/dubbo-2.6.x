package com.lyn.dubbo;

import com.alibaba.dubbo.common.Extension;
import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.lyn.dubbo.spi.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: dubbo-2.6.x
 * @author: lyn
 * * @create: 2020-04-06 15:05
 **/
public class DubboSPIDemo {
    public static void main(String[] args) {
        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
        Map<String, String> map = new HashMap<String, String>();
        map.put("car", "red");
        URL url = new URL("", "", 1,map);
        Car red = extensionLoader.getExtension("benz");
        red.getColor(url);
    }
}
