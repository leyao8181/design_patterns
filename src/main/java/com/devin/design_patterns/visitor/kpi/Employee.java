package com.devin.design_patterns.visitor.kpi;

import jdk.internal.org.objectweb.asm.commons.RemappingAnnotationAdapter;

import java.util.Random;

public abstract class Employee {
    public  String name;
    public  int kpi;

    public Employee(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }

    public abstract void accept(IVisitor visitor);
}
