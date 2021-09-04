package com.devin.design_patterns;

public class TestClass {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("devin");
        Student tom = new Student("tom");
        Student mic = new Student("mic");
        teacher.addObserver(tom);
        teacher.addObserver(mic);
        teacher.say("同学们，大家好！");
    }
}
