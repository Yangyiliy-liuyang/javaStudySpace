package com.day0507.PolyDetail03;

public class Main {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        //true  bb��BB���������ͻ���������
        System.out.println(bb instanceof AA);

        AA aa = new BB();
        //aa�ı���������AA ����������BB ����ת��
        System.out.println(aa instanceof BB);
        System.out.println(aa instanceof AA);

        Object obj = new Object();
        System.out.println(obj instanceof AA);
        //false

        String str = "hello";
        //System.out.println(str instanceof AA);//false
        System.out.println(str instanceof Object);
        //true

    }
}
class AA{}
class BB extends AA{}