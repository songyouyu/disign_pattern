package com.imooc.design.pattern.structural.adapter.objectadapter;

/**
 * @author youyusong
 * @date 2018/12/8
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
