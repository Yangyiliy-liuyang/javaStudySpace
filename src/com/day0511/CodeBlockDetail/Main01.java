package com.day0511.CodeBlockDetail;

public class Main01 {
    public static void main(String[] args) {

        //调用顺序
        //static方法》普通代码块》构造方法
        A a = new A();
        System.out.println();
        B b = new B();
    }
}
class A{
    private int n2=getN2();
    private static int n1=getN1();

    static{
        System.out.println("A 静态代码块01");
    }
    private static int getN1(){
        System.out.println("getN1被调用...");
        return 100;
    }
    private int getN2(){  //普通方法
        System.out.println("getN2被调用...");
        return 100;
    }
}
class B{
    static{
        System.out.println("A 静态代码块01");
    }
    private static int n1=getN1();
    private static int getN1(){
        System.out.println("getN1被调用...");
        return 100;
    }
}
