package com.day0511.CodeBlockDetail;

public class Main01 {
    public static void main(String[] args) {

        //����˳��
        //static��������ͨ����顷���췽��
        A a = new A();
        System.out.println();
        B b = new B();
    }
}
class A{
    private int n2=getN2();
    private static int n1=getN1();

    static{
        System.out.println("A ��̬�����01");
    }
    private static int getN1(){
        System.out.println("getN1������...");
        return 100;
    }
    private int getN2(){  //��ͨ����
        System.out.println("getN2������...");
        return 100;
    }
}
class B{
    static{
        System.out.println("A ��̬�����01");
    }
    private static int n1=getN1();
    private static int getN1(){
        System.out.println("getN1������...");
        return 100;
    }
}
