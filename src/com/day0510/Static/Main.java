package com.day0510.Static;

public class Main {
    public static void main(String[] args) {
        //类变量 两个特点：static在类加载时完成，static类内所有对象实例共享
        //以前的static放在静态域里面 现在在堆class对象底部
        Chird libai = new Chird("libai");
        libai.join();
        Chird.count++;
        Chird dupu = new Chird("dupu");
        dupu.join();//1850769025
        Chird.count++;
        System.out.println("有" + Chird.count + "加入游戏");
    }
}
class Chird{
    private String name;
    public static int count = 0;

    public Chird(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name + " 加入游戏");
    }
}