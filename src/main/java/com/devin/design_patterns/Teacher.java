package com.devin.design_patterns;

import lombok.Data;

import java.util.Observable;
@Data
public class Teacher extends Observable {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public  void say(String content){
        System.out.println(this.name+":"+content);
        setChanged();
        notifyObservers(content);
    }
}
