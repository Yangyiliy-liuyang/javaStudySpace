package com.day0508.PolyArray;

public class Teacher extends Person{

    public Teacher(String name, int age) {
        super(name, age);
    }
    @Override
    public String Say() {
        return "teacher " + super.Say() ;
    }

    public void teach(){
        System.out.println("teacher " + getName() + " 在教java");
    }
}
