package com.imooc.design.principle.compositionaggregation;

/**
 * 合成复用原则
 * @author youyusong
 * @date 2018/11/7
 */
public class Test {

    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }

}
