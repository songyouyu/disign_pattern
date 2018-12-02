package com.imooc.design.pattern.structural;

/**
 * 外观模式
 * @author youyusong
 * @date 2018/11/26
 */
public class Test {

    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");

        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.exchange(pointsGift);
    }

}
