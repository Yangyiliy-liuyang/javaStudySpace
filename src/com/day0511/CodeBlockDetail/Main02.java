package com.day0511.CodeBlockDetail;

public class Main02 {
    public static void main(String[] args) {
        new BBB();
    }
}
class AAA{
    public AAA() {
        System.out.println("AAA() ������������...");
    }
}
class BBB extends AAA{
    {
        System.out.println("BBB() ��ͨ�����...");
    }
    public BBB() {
        System.out.println("BBB() ������������...");
    }
}