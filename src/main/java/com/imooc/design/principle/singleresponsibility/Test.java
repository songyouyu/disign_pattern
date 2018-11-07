package com.imooc.design.principle.singleresponsibility;

/**
 * 单一职责原则
 * @author youyusong
 * @date 2018/11/7
 */
public class Test {

    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("鸵鸟");
//        bird.mainMoveMode("大雁");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }

}
