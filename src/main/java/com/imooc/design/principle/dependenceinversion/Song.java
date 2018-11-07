package com.imooc.design.principle.dependenceinversion;

/**
 * @author youyusong
 * @date 2018/11/7
 */
public class Song {

    // v1
//    public void studyJavaCourse() {
//        System.out.println("Song 在学习 java 课程");
//    }
//
//    public void studyFECourse() {
//        System.out.println("Song 在学习 FE 课程");
//    }

    // v2
//    public void studyImoocCourse(ICourse iCourse) {
//        iCourse.studyCourse();
//    }


    // v3
//    private ICourse iCourse;
//
//    public Song(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }
//
//    public void studyImoocCourse() {
//        iCourse.studyCourse();
//    }


    // v4
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }
}
