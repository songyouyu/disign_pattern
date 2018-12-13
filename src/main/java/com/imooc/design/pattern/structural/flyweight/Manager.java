package com.imooc.design.pattern.structural.flyweight;

/**
 * @author youyusong
 * @date 2018/12/13
 */
public class Manager implements Employee {

    /**
     * 内部状态
     */
    String title = "部门经理";

    String department;

    String reportContent;

    @Override
    public void report() {

    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }
}
