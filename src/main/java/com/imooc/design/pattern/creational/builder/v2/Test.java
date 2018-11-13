package com.imooc.design.pattern.creational.builder.v2;

/**
 * @author youyusong
 * @date 2018/11/13
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("Java设计模式精讲")
                .buildCoursePPT("Java设计模式精讲PPT").buildCourseVideo("Java设计模式精讲视频").build();
        System.out.println(course);
    }

}
