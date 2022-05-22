package com.day0512.SingleTon;

public class Main {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        GirlFriend instance1 = GirlFriend.getInstance();
        System.out.println(instance1);
        System.out.println();
        System.out.println(instance==instance1);
    }
}

//只能有一个女朋友
class GirlFriend{
    private String name;
    //[单例模式--饿汉式] 可能造成创建了对象没有使用，造成浪费。
    //如何保障只能创建一个女朋友
    //1.将构造器私有化
    //2.在类的内部直接创建对象（static）
    //3.提供一个公共的static方法，返回gf对象

    private static GirlFriend gf = new GirlFriend("小红");
    //为了能够在静态方法中返回gf对象 需要将其修饰为static

    private GirlFriend(String name) {
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}