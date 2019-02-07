package com.imooc.design.pattern.behavioral.visitor;

/**
 * @author youyusong
 * @date 2019/2/7
 */
public interface IVisitor {


    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);


}
