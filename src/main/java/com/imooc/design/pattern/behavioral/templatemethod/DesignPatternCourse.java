package com.imooc.design.pattern.behavioral.templatemethod;

/**
 * @author youyusong
 * @date 2019/2/6
 */
public class DesignPatternCourse extends ACourse {

    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
