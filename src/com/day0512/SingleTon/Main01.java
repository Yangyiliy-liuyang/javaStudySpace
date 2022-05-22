package com.day0512.SingleTon;

public class Main01 {
    public static void main(String[] args) {
    //new Cat();
        System.out.println(Cat.N);
        Cat instance = Cat.getInstance();
        System.out.println(instance);
        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);
        System.out.println(instance==instance1);
    }
}
class Cat{
    private String name;
    public static int N=1000;
    private static Cat cat;
    //[懒汉式] 只有当用户调用getInstance 使用时才创建
    //1.构造器私有化
    //2.定义一个static静态属性对象
    //3.提供一个public方法

    private Cat(String name) {
        System.out.println("构造器调用...");
        this.name = name;
    }
    public static Cat getInstance(){
        if(cat==null){
            cat = new Cat("小红");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}