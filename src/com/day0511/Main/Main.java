package com.day0511.Main;

public class Main {
    private static String name = "hello world";
    public static void hi(){
        System.out.println("hello");
    }
    private int n1 = 100;
    public void cry(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        //1.静态方法main 可以访问本类的静态成员
        System.out.println(name);
        hi();
        //2.静态方法main 不可以访问本类的非静态成员
        //System.out.println(n1);
        //cry();
        //3.静态方法main 要访问本类的非静态成员，需要先创建对象，再调用。
        Main main = new Main();
        System.out.println(main.n1);
        main.cry();
    }
}
