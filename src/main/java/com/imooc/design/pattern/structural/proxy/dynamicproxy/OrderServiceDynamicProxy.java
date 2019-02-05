package com.imooc.design.pattern.structural.proxy.dynamicproxy;

import com.imooc.design.pattern.structural.proxy.Order;
import com.imooc.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author youyusong
 * @date 2019/2/5
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class  cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = args[0];
        beforeMethod(obj);
        Object invoke = method.invoke(target, args);
        afterMethod();
        return invoke;
    }

    private void beforeMethod(Object obj) {
        int userId = 0;
        System.out.println("动态代理 before code");

        if (obj instanceof Order) {
            Order order = (Order) obj;
            userId = order.getUserId();
        }

        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db" + dbRouter + "】处理数据");

        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
    }

    private void afterMethod(){
        System.out.println("动态代理 after code");
    }

}
