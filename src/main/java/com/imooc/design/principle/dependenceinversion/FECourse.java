package com.imooc.design.principle.dependenceinversion;

/**
 * @author youyusong
 * @date 2018/11/7
 */
public class FECourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Song 在学习 FE 课程");
    }
}
