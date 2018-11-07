package com.imooc.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @author youyusong
 * @date 2018/11/7
 */
public class Base {

    public void method(HashMap map){
        System.out.println("父类被执行");
    }

}
