package com.imooc.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.EventBus;

/**
 * @author youyusong
 * @date 2019/2/7
 */
public class Test {

    public static void main(String[] args) {
        EventBus eventbus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventbus.register(guavaEvent);
        eventbus.post("xxxxxxxxxx");
    }

}
