package com.day0512.Abstract;

public class Main {
    public static void main(String[] args) {
        //抽象类不能被实例化
        //new Animal();
    }
}
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    /*
    public void eat() {
        System.out.println("这是一个动物，不知道吃啥...");
    }
    */

    public abstract void eat();
    //当一个类存在抽象方法时，需要将该类声明为abstract类。、
    //抽象类可以没有抽象方法，还可以有实现方法。

}
