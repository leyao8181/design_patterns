package com.devin.design_patterns.visitor.kpi;

public interface IVisitor {
    void visit(Manager manager);
    void visit(Engineer engineer);
}
