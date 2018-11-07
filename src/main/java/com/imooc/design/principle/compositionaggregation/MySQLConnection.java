package com.imooc.design.principle.compositionaggregation;

/**
 * @author youyusong
 * @date 2018/11/7
 */
public class MySQLConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
