package com.imooc.design.principle.liskovsubstitution;

/**
 * 正方形
 * @author youyusong
 * @date 2018/11/7
 */
public class Square implements Quadrangle{

    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }

}
