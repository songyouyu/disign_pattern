package com.imooc.design.pattern.creational.abstractfactory;

/**
 * @author youyusong
 * @date 2018/11/12
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
