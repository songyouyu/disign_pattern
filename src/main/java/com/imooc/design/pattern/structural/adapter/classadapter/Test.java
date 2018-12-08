package com.imooc.design.pattern.structural.adapter.classadapter;

/**
 * 类适配器
 * @author youyusong
 * @date 2018/12/8
 */
public class Test {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }

}
