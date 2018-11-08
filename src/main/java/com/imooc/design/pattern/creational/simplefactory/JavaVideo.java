package com.imooc.design.pattern.creational.simplefactory;

/**
 * @author youyusong
 * @date 2018/11/8
 */
public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制 java 课程");
    }

}
