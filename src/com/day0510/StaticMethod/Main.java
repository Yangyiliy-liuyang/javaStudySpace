package com.day0510.StaticMethod;

import java.util.TooManyListenersException;

public class Main {
    public static void main(String[] args) {
        Student tom = new Student("tom");
        tom.payFee(100);
        Student jack = new Student("jack");
        jack.payFee(130);
        Student.showFee();

        System.out.println(Math.sqrt(9));

        System.out.println(MyTools.calSum(10,20));

    }
}
class MyTools{
    public static double calSum(double n1, double n2){
        return n1 + n2;
    }
}
class Student{
    private String name;
    private static double fee = 0;

    public Student(String name) {
        this.name = name;
    }
    //˵��
    //1.������ʹ����static���κ󣬸÷������Ǿ�̬����
    //2.��̬�����Ϳ��Է��ʾ�̬����/����

    public static void payFee(double fee){
        Student.fee += fee;
        //���۵�
    }
    public static void showFee(){
        //�෽���в�����ʹ�úͶ����йصĹؼ���
        //����this��super����ͨ��������Ա���������ԡ�
        //ֻ�ܷ��ʾ�̬������̬����
        System.out.println("��ѧ����" + fee);
        //System.out.println("��ѧ����" + this.fee);
    }
}