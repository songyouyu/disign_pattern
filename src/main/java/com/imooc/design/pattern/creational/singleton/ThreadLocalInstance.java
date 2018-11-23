package com.imooc.design.pattern.creational.singleton;

/**
 * ThreadLocal 线程 "单例"
 * @author youyusong
 * @date 2018/11/23
 */
public class ThreadLocalInstance {

    private ThreadLocalInstance() {

    }

    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal = new ThreadLocal(){

        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }

    };

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstanceThreadLocal.get();
    }

}
