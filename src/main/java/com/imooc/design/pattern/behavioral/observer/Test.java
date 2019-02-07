package com.imooc.design.pattern.behavioral.observer;

/**
 * 观察者模式
 * @author youyusong
 * @date 2019/2/7
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course("Java设计模式精讲");
        Teacher teacher1 = new Teacher("Alpha");
//        Teacher teacher2 = new Teacher("Beta");


        course.addObserver(teacher1);
//        course.addObserver(teacher2);

        Question question = new Question();
        question.setUserName("Song");
        question.setQuestionContent("Java的主函数如何编写");

        course.produceQuestion(course,question);
    }

}
