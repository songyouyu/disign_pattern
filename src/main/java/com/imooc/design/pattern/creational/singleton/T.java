package com.imooc.design.pattern.creational.singleton;

/**
 * @author youyusong
 * @date 2018/11/20
 */
public class T implements Runnable {

    @Override
    public void run() {
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + lazyDoubleCheckSingleton);
    }
}
