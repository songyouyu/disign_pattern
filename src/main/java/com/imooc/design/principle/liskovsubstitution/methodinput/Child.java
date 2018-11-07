package com.imooc.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * @author youyusong
 * @date 2018/11/7
 */
public class Child extends Base {

//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类HashMap入参方法被执行");
//    }

    public void method(Map map) {
        System.out.println("子类Map入参方法被执行");
    }

}
