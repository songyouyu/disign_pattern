package com.imooc.design.pattern.creational.singleton;

/**
 * 枚举单例
 * @author youyusong
 * @date 2018/11/23
 */
public enum EnumInstance {

    INSTANCE{
        @Override
        protected void printTest() {
            System.out.println("123");
        }
    };

    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }

}
