package com.imooc.design.pattern.creational.abstractfactory;

/**
 * @author youyusong
 * @date 2018/11/12
 */
public class PythonArticle extends Article {

    @Override
    public void produce() {
        System.out.println("编写 Python 课程手记");
    }
}
