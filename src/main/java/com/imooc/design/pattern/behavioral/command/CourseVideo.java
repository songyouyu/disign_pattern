package com.imooc.design.pattern.behavioral.command;

/**
 * @author youyusong
 * @date 2019/2/7
 */
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }
    public void open(){
        System.out.println(this.name+"课程视频开放");
    }
    public void close(){
        System.out.println(this.name+"课程视频关闭");
    }

}
