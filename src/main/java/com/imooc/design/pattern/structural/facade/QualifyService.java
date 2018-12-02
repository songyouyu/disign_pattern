package com.imooc.design.pattern.structural.facade;

/**
 * @author youyusong
 * @date 2018/11/26
 */
public class QualifyService {

    public boolean available(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " 积分资格通过,库存通过");
        return true;
    }

}
