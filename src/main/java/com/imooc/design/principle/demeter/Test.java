package com.imooc.design.principle.demeter;

/**
 * 迪米特原则
 * @author youyusong
 * @date 2018/11/7
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);

    }

}
