package com.imooc.design.pattern.behavioral.mediator;

/**
 * 中介者模式
 * @author youyusong
 * @date 2019/2/7
 */
public class Test {

    public static void main(String[] args) {
        User song = new User("Song");
        User tom= new User("Tom");

        song.sendMessage(" Hey! Tom! Let's learn Design Pattern");
        tom.sendMessage("OK! Song");
    }

}
