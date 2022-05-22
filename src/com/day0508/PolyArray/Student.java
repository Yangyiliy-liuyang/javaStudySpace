package com.day0508.PolyArray;

public class Student extends Person{
    int score;

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String Say() {
        return "student " + super.Say() + " score " + score;
    }

    public void study(){
        System.out.println("student " + getName() + " 在学java");
    }
}
