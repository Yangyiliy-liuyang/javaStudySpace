package com.day0512.Abstract;

public class Main {
    public static void main(String[] args) {
        //�����಻�ܱ�ʵ����
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
        System.out.println("����һ�������֪����ɶ...");
    }
    */

    public abstract void eat();
    //��һ������ڳ��󷽷�ʱ����Ҫ����������Ϊabstract�ࡣ��
    //���������û�г��󷽷�����������ʵ�ַ�����

}
