package com.imooc.design.pattern.creational.singleton;

import java.util.HashMap;

/**
 * 容器单例
 * @author youyusong
 * @date 2018/11/23
 */
public class ContainerSingleton {

    private ContainerSingleton() {

    }

    private static HashMap<String, Object> singletonMap = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if (key != null && instance != null) {
            if (! singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }

}
