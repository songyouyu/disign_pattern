package com.imooc.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youyusong
 * @date 2018/11/7
 */
public class TeamLeader {

    public void checkNumberOfCourses(){
        List<Course> courseList = new ArrayList<>();
        for(int i = 0 ;i < 20; i++){
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是："+courseList.size());
    }

}
