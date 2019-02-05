package com.imooc.design.pattern.structural.proxy;

/**
 * @author youyusong
 * @date 2019/2/5
 */
public class OrderDaoImpl implements IOrderDao {

    @Override
    public int insert(Order order) {
        System.out.println("Dao 层添加 Order 成功");
        return 1;
    }
}
