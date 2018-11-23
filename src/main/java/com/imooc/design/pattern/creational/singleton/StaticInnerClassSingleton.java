package com.imooc.design.pattern.creational.singleton;

/**
 * 静态内部类--基于类初始化的延迟加载
 * @author youyusong
 * @date 2018/11/21
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
        if (InnerClassSingleton.staticInnerClassSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private static class InnerClassSingleton{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClassSingleton.staticInnerClassSingleton;
    }
}
