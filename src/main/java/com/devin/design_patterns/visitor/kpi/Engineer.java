package com.devin.design_patterns.visitor.kpi;

import java.util.Random;

public class Engineer extends Employee{
    public Engineer(String name) {
        super(name);
    }


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getCodeLines(){
        return new Random().nextInt(10*10000);
    }
}
