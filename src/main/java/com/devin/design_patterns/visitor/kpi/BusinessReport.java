package com.devin.design_patterns.visitor.kpi;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {
    private List<Employee> employees = new LinkedList<Employee>();

    public BusinessReport() {
        employees.add(new Manager("产品经理A"));
        employees.add(new Manager("产品经理B"));
        employees.add(new Engineer("工程师A"));
        employees.add(new Engineer("工程师B"));
        employees.add(new Engineer("工程师C"));
        employees.add(new Engineer("工程师D"));
    }

    public void showReport (IVisitor visitor) {
        for (Employee employee:employees) {
            employee.accept(visitor);
        }
    }
}
