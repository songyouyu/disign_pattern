package com.imooc.design.pattern.creational.prototype.abstractprototype;

/**
 * 原型模式的另外一种应用
 * @author youyusong
 * @date 2018/11/24
 */
public class B extends A{

    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        b.clone();
    }

}
