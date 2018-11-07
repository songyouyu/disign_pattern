package com.imooc.design.principle.dependenceinversion;

/**
 * 依赖倒置原则
 * @author youyusong
 * @date 2018/11/7
 */
public class Test {

    public static void main(String[] args) {
        // v1
//        Song song = new Song();
//        song.studyJavaCourse();
//        song.studyFECourse();

        // v2
//        Song song = new Song();
//        song.studyImoocCourse(new JavaCourse());
//        song.studyImoocCourse(new FECourse());
//        song.studyImoocCourse(new PythonCourse());

        // v3
//        Song song = new Song(new JavaCourse());
//        song.studyImoocCourse();

        // v4
        Song song = new Song();
        song.setiCourse(new JavaCourse());
        song.studyImoocCourse();

        song.setiCourse(new PythonCourse());
        song.studyImoocCourse();
    }

}
