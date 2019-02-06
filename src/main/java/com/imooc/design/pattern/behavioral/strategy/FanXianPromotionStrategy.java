package com.imooc.design.pattern.behavioral.strategy;

/**
 * @author youyusong
 * @date 2019/2/6
 */
public class FanXianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额存放到慕课网用户的余额中");
    }

}
