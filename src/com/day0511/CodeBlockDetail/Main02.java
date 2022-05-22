package com.day0511.CodeBlockDetail;

public class Main02 {
    public static void main(String[] args) {
        new BBB();
    }
}
class AAA{
    public AAA() {
        System.out.println("AAA() 构造器被调用...");
    }
}
class BBB extends AAA{
    {
        System.out.println("BBB() 普通代码块...");
    }
    public BBB() {
        System.out.println("BBB() 构造器被调用...");
    }
}