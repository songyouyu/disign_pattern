package com.imooc.design.pattern.structural.adapter.classadapter;

/**
 * @author youyusong
 * @date 2018/12/8
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        // ...
        super.adapteeRequest();
        // ...
    }
}
