package com.imooc.design.principle.liskovsubstitution;

/**
 * 长方形
 * @author youyusong
 * @date 2018/11/7
 */
public class Rectangle implements Quadrangle {

    private long length;

    private long width;

    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }

}
