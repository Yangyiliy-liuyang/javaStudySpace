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
    //说明
    //1.当方法使用了static修饰后，该方法就是静态变量
    //2.静态变量就可以访问静态属性/变量

    public static void payFee(double fee){
        Student.fee += fee;
        //积累到
    }
    public static void showFee(){
        //类方法中不允许使用和对象有关的关键字
        //比如this和super，普通方法（成员方法）可以。
        //只能访问静态变量或静态方法
        System.out.println("总学费有" + fee);
        //System.out.println("总学费有" + this.fee);
    }
}