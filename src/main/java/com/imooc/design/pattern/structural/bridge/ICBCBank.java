package com.imooc.design.pattern.structural.bridge;

/**
 * @author youyusong
 * @date 2019/2/5
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
