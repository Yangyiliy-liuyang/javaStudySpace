package com.day0507.PolyDetail02;

public class Main {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.count);
        //10 ����������
        Sub sub = new Sub();
        System.out.println(sub.count);
        //20

        //���Կ����� ����������
    }
}
class Base{
    int count = 10;
}
class Sub extends Base{
    int count = 20;
}