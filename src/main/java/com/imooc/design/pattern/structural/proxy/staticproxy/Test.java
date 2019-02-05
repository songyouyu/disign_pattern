package com.imooc.design.pattern.structural.proxy.staticproxy;

import com.imooc.design.pattern.structural.proxy.Order;

/**
 * 代理模式(静态代理)
 * @author youyusong
 * @date 2019/2/5
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }

}
