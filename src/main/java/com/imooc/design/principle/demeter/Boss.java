package com.imooc.design.principle.demeter;

/**
 * @author youyusong
 * @date 2018/11/7
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }

}
