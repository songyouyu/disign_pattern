package com.imooc.design.principle.openclose;

/**
 * 开闭原则
 * @author youyusong
 * @date 2018/11/7
 */
public class Test {

    public static void main(String[] args) {
//        ICourse javaCourse = new JavaCourse(96, "java设计模式", 299d);
//        // 实际项目中不使用 System.out, 因为有锁
//        System.out.println("课程ID : " + javaCourse.getId() + ", 课程名称 : " + javaCourse.getName() + ", 课程价格 : " + javaCourse.getPrice());

//        ICourse javaCourse = new JavaDiscountCourse(96, "java设计模式", 299d);
//        System.out.println("课程ID : " + javaCourse.getId() + ", 课程名称 : " + javaCourse.getName() + ", 课程价格 : " + javaCourse.getPrice());

        ICourse javaCourse = new JavaDiscountCourse(96, "java设计模式", 299d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse)javaCourse;
        System.out.println("课程ID : " + javaDiscountCourse.getId() + ", 课程名称 : " + javaDiscountCourse.getName() +
                ", 课程折扣后的价格 : " + javaDiscountCourse.getPrice() + ", 课程原价 : " + javaDiscountCourse.getOriginPrice());
    }

}
