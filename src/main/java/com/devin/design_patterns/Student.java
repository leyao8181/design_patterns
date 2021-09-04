package com.devin.design_patterns;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Teacher teacher = (Teacher) o;
        System.out.println(this.name + " received teacher "+ teacher.getName()+" say :"+arg.toString());
    }
}
