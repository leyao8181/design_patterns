package com.devin.design_patterns.visitor.kpi;

public class TestClass {
    public static void main(String[] args) {
        BusinessReport businessReport = new BusinessReport();
        System.out.println("============CTO================");
        businessReport.showReport(new CTOVisitor());
        System.out.println("============CEO================");
        businessReport.showReport(new CEOVisitor());
    }
}
