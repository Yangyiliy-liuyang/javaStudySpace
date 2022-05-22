package com.day0513.Interface01;

public class Main {
    public static void main(String[] args) {

    }
}

//如果一个类 implements(实现) 接口

//接口不能被实例化
//接口中所有方法都是public方法，接口中抽象方法，可以不用abstract修饰
//一个普通类实现接口，需要将该接口的所有抽象方法都实现
//抽象类实现接口，可以不实现接口的抽象方法。

class A implements Interface{
    @Override
    public void hi() {
        System.out.println("hihihi...");
    }
}
class B implements Interface{

    @Override
    public void hi() {
        System.out.println("hihihi...");
    }

    @Override
    public void ok() {
        Interface.super.ok();
    }
}
abstract class C implements Interface{

}