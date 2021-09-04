package com.devin.design_patterns.visitor.kpi;

import java.util.Random;

public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getProducts(){
        return new Random().nextInt(10);
    }
}
