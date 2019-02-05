package com.imooc.design.pattern.structural.bridge;

/**
 * @author youyusong
 * @date 2019/2/5
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
