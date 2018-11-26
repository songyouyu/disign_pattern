package com.imooc.design.pattern.structural;

/**
 * @author youyusong
 * @date 2018/11/26
 */
public class ShippingService {

    public String ship(PointsGift pointsGift) {
        System.out.println(pointsGift.getName() + "进入物流系统");
        String orderNo = "666";
        return orderNo;
    }

}
