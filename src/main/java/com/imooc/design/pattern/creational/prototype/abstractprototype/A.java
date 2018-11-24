package com.imooc.design.pattern.creational.prototype.abstractprototype;

/**
 * @author youyusong
 * @date 2018/11/24
 */
public abstract class A implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
