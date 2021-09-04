package com.devin.design_patterns.visitor.kpi;

public class CEOVisitor implements IVisitor{
    @Override
    public void visit(Manager manager) {
        System.out.println("经理："+manager.name+ "kpi： "+ manager.kpi);
    }

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师："+engineer.name+ "kpi： "+ engineer.kpi);
    }
}
