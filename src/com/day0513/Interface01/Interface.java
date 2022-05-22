package com.day0513.Interface01;

public interface Interface {
    //属性 方法

    int n1 = 10;
    //等价于 public static final int n1 = 10;

    public void hi();
    //abstract public void hi();
    //在接口中，抽象方法，可以省略abstract关键字。

    //在jdk8后，可以有默认实现方法，需要使用default关键字修饰。

    default public void ok(){
        System.out.println("okokok...");
    }

    //在jdk8后，可以有静态方法。

    public static void cry(){
        System.out.println("cry...");
    }
}
