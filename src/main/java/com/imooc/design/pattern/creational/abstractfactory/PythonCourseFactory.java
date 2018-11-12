package com.imooc.design.pattern.creational.abstractfactory;

/**
 * @author youyusong
 * @date 2018/11/12
 */
public class PythonCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
