package com.imooc.design.pattern.behavioral.visitor;

/**
 * @author youyusong
 * @date 2019/2/7
 */
public class FreeCourse extends Course{

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

}
