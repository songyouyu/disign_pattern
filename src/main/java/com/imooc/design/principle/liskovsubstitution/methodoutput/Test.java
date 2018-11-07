package com.imooc.design.principle.liskovsubstitution.methodoutput;

/**
 * @author youyusong
 * @date 2018/11/7
 */
public class Test {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.method());
    }

}
