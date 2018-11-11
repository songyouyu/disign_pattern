package com.imooc.design.pattern.creational.factorymethod;

/**
 * @author youyusong
 * @date 2018/11/11
 */
public class FEVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
