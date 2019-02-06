package com.imooc.design.pattern.behavioral.interpreter;

/**
 * @author youyusong
 * @date 2019/2/6
 */
public class NumberInterpreter implements Interpreter {

    private int number;

    public NumberInterpreter(int number){
        this.number = number;
    }

    public NumberInterpreter(String number){
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret(){
        return this.number;
    }

}
