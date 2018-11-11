package com.imooc.design.pattern.creational.factorymethod;

/**
 * 工厂方法模式
 * @author youyusong
 * @date 2018/11/8
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }

}
