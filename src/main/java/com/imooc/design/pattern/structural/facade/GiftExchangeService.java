package com.imooc.design.pattern.structural.facade;

import com.imooc.design.pattern.structural.facade.PointsGift;
import com.imooc.design.pattern.structural.facade.PointsPaymentService;
import com.imooc.design.pattern.structural.facade.QualifyService;
import com.imooc.design.pattern.structural.facade.ShippingService;

/**
 * @author youyusong
 * @date 2018/11/26
 */
public class GiftExchangeService {

    QualifyService qualifyService = new QualifyService();
    PointsPaymentService pointsPaymentService = new PointsPaymentService();
    ShippingService shippingService = new ShippingService();

    public void exchange(PointsGift pointsGift) {
        if (qualifyService.available(pointsGift)) {
            if (pointsPaymentService.pay(pointsGift)) {
                String shippingNo = shippingService.ship(pointsGift);
                System.out.println("物流系统下单成功, 您的订单号为 : " + shippingNo);
            }
        }
    }

}
