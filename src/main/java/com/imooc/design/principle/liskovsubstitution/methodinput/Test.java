package com.imooc.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @author youyusong
 * @date 2018/11/7
 */
public class Test {

    public static void main(String[] args) {
        Base child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }

}
