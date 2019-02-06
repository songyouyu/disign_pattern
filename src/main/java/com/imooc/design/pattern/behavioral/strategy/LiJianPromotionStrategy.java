package com.imooc.design.pattern.behavioral.strategy;

/**
 * @author youyusong
 * @date 2019/2/6
 */
public class LiJianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("立减促销,课程的价格直接减去配置的价格");
    }

}
