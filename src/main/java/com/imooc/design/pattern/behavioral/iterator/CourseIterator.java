package com.imooc.design.pattern.behavioral.iterator;

/**
 * @author youyusong
 * @date 2019/2/6
 */
public interface CourseIterator {

    Course nextCourse();

    boolean isLastCourse();

}
