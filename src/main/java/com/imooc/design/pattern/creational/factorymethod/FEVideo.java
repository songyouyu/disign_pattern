package com.imooc.design.pattern.creational.factorymethod;

/**
 * @author youyusong
 * @date 2018/11/11
 */
public class FEVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制 FE 前端课程");
    }
}
