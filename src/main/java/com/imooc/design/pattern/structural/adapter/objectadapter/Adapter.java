package com.imooc.design.pattern.structural.adapter.objectadapter;

/**
 * @author youyusong
 * @date 2018/12/8
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        // ...
        adaptee.adapteeRequest();
        // ...
    }
}
