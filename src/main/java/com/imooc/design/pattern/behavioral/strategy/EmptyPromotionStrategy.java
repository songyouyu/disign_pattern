package com.imooc.design.pattern.behavioral.strategy;

/**
 * @author youyusong
 * @date 2019/2/6
 */
public class EmptyPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }

}
