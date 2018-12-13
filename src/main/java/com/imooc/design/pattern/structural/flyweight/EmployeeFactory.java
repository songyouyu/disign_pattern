package com.imooc.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author youyusong
 * @date 2018/12/13
 */
public class EmployeeFactory {

    public static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        if (manager == null) {
            manager = new Manager(department);
            System.out.println("创建部门经理 : " + department);
            String reportContent = department + "部门汇报, 报告的内容是 ......";
            manager.setReportContent(reportContent);
            System.out.println("创建报告 : " + reportContent);

            EMPLOYEE_MAP.put(department, manager);
        }

        return manager;
    }

}
