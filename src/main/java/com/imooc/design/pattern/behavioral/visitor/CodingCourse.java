package com.imooc.design.pattern.behavioral.visitor;

/**
 * @author youyusong
 * @date 2019/2/7
 */
public class CodingCourse extends Course {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
