package com.imooc.design.pattern.structural.proxy;

/**
 * @author youyusong
 * @date 2019/2/5
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        //Spring会自己注入，课程中直接new
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service 层调用 Dao 层添加 Order");
        return iOrderDao.insert(order);
    }
}
