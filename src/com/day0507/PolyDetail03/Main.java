package com.day0507.PolyDetail03;

public class Main {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        //true  bb是BB的运行类型或者子类吗？
        System.out.println(bb instanceof AA);

        AA aa = new BB();
        //aa的编译类型是AA 运行类型是BB 向上转型
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