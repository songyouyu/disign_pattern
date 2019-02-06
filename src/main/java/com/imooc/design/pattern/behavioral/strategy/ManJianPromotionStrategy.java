package com.imooc.design.pattern.behavioral.strategy;

/**
 * @author youyusong
 * @date 2019/2/6
 */
public class ManJianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200-20元");
    }
}
