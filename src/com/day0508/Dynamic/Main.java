package com.day0508.Dynamic;

public class Main {
    //动态绑定机制 dynamicBinding
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}
class A{
    public int i = 10;
    public int sum(){
        return get1()+10;
    }
    public int sum1(){
        return i+10;
    }
    public int get1(){
        return i;
    }
}
class B extends A{
    public int i = 20;
    /*
    public int sum(){
        return i+20;
    }

    public int sum1(){
        return i+10;
    }
     */
    public int get1(){
        return i;
    }
}