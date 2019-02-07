package com.imooc.design.pattern.behavioral.visitor;

/**
 * @author youyusong
 * @date 2019/2/7
 */
public abstract class Course {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisitor visitor);

}
