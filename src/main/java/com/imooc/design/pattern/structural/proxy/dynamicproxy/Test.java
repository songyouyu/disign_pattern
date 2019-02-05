package com.imooc.design.pattern.structural.proxy.dynamicproxy;

import com.imooc.design.pattern.structural.proxy.IOrderService;
import com.imooc.design.pattern.structural.proxy.Order;
import com.imooc.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * @author youyusong
 * @date 2019/2/5
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }

}
