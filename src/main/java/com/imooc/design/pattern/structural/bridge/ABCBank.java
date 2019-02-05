package com.imooc.design.pattern.structural.bridge;

/**
 * @author youyusong
 * @date 2019/2/5
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
