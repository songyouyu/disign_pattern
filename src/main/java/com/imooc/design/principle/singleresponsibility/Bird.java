package com.imooc.design.principle.singleresponsibility;

/**
 * @author youyusong
 * @date 2018/11/7
 */
public class Bird {

    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }

}
