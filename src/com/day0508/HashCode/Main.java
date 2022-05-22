package com.day0508.HashCode;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        A a2 = a;
        System.out.println("a.hashcode()=" + a.hashCode());
        System.out.println("a1.hashcode()=" + a1.hashCode());
        System.out.println("a2.hashcode()=" + a2.hashCode());
    }
}
class A{

}