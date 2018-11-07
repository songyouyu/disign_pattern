package com.imooc.design.principle.dependenceinversion;

/**
 * @author youyusong
 * @date 2018/11/7
 */
public class PythonCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Song 在学习 Python 课程");
    }
}
