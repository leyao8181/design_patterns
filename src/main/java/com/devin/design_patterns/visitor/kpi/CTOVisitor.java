package com.devin.design_patterns.visitor.kpi;

public class CTOVisitor implements IVisitor{
    @Override
    public void visit(Manager manager) {
        System.out.println("经理："+manager.name+ "产品数： "+ manager.getProducts());
    }

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师："+engineer.name+ "代码行数： "+ engineer.getCodeLines());
    }
}
