package com.imooc.design.pattern.creational.prototype;

/**
 * 原型模式
 * @author youyusong
 * @date 2018/11/24
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
//        Mail mail = new Mail();
//        mail.setContent("初始化模版");
//
//        for (int i = 0; i < 10; i ++) {
//            mail.setName("姓名" + i);
//            mail.setEmailAddress("姓名" + i + "@imooc.com");
//            mail.setContent("恭喜您, 慕课网活动中奖了");
//            MailUtil.sendMail(mail);
//        }
//
//        MailUtil.saveOriginMailRecord(mail);


        Mail mail = new Mail();
        mail.setContent("初始化模版");
        System.out.println("初始化mail:" + mail);
        for (int i = 0; i < 10; i ++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@imooc.com");
            mailTemp.setContent("恭喜您, 慕课网活动中奖了");
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆的mailTemp:"+mailTemp);
        }

        MailUtil.saveOriginMailRecord(mail);
    }

}
