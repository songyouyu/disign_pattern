package com.imooc.design.pattern.creational.abstractfactory;

/**
 * @author youyusong
 * @date 2018/11/12
 */
public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制 Java 视频");
    }
}
