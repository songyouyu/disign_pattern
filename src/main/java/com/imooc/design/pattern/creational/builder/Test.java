package com.imooc.design.pattern.creational.builder;

/**
 * 建造者模式
 * @author youyusong
 * @date 2018/11/13
 */
public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("xxx", "xxx",
                "xxx", "xxx", "xxx");
        System.out.println(course);
    }

}
