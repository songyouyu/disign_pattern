package com.imooc.design.pattern.behavioral.interpreter;

/**
 * @author youyusong
 * @date 2019/2/6
 */
public class MultiInterpreter implements Interpreter {

    private Interpreter firstExpression,secondExpression;

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression){
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret(){
        return this.firstExpression.interpret() * this.secondExpression.interpret();
    }

    @Override
    public String toString(){
        return "*";
    }

}
