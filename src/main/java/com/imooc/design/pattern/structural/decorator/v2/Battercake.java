package com.imooc.design.pattern.structural.decorator.v2;

/**
 * @author youyusong
 * @date 2018/12/2
 */
public class Battercake extends ABattercake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
