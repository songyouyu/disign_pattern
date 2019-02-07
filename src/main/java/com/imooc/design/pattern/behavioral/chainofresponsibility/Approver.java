package com.imooc.design.pattern.behavioral.chainofresponsibility;

/**
 * @author youyusong
 * @date 2019/2/7
 */
public abstract class Approver {

    protected Approver approver;

    public void setNextApprover(Approver approver){
        this.approver = approver;
    }

    public abstract void deploy(Course course);

}
