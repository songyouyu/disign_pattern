package com.imooc.design.pattern.behavioral.iterator;

/**
 * @author youyusong
 * @date 2019/2/6
 */
public interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator getCourseIterator();


}
