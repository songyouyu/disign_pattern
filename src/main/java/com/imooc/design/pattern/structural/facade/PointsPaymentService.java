package com.imooc.design.pattern.structural;

/**
 * @author youyusong
 * @date 2018/11/26
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift) {
        System.out.println("支付" + pointsGift.getName() + " 积分成功");
        return true;
    }

}
