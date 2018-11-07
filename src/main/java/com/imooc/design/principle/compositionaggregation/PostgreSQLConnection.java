package com.imooc.design.principle.compositionaggregation;

/**
 * @author youyusong
 * @date 2018/11/7
 */
public class PostgreSQLConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }

}
