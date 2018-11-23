package com.imooc.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉式
 * @author youyusong
 * @date 2018/11/22
 */
public class HungrySingleton implements Serializable {

    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * 通过源码, 如果实现了序列化又写了此方法, 则直接返回此方法返回的对象, 而不是返回反射创建的对象
     * 在此过程中, 其实创建了对象, 只是没有返回反射创建的对象而已
     * @return
     */
    private Object readResolve() {
        return hungrySingleton;
    }
}
