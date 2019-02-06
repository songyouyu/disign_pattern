package com.imooc.design.pattern.behavioral.interpreter;

/**
 * 解释器模式
 * @author youyusong
 * @date 2019/2/6
 */
public class Test {

    public static void main(String[] args) {
        String geelyInputStr = "6 100 11 + *";
        SongExpressionParser expressionParser = new SongExpressionParser();
        int result=expressionParser.parse(geelyInputStr);
        System.out.println("解释器计算结果: " + result);
    }

}
