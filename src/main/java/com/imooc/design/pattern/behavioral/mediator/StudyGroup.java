package com.imooc.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @author youyusong
 * @date 2019/2/7
 */
public class StudyGroup {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }

}
