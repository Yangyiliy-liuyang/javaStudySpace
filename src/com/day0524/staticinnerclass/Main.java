package com.day0524.staticinnerclass;

/**
 * @author yangyiliy_liuyang
 *
 */
public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m();
        Outer.Inner inner = new Outer.Inner();
        inner.say();

        Outer.Inner inner1 = Outer.getInner1();
        inner1.say();
    }
}
class Outer{
    private int n=10;
    private static String name = "张三";
    //静态内部类
    //1.放在外部类的成员位置
    //2.使用static修饰
    //3.可以使用外部类的所有静态成员，包括私有的，但是不能直接访问非静态成员
    //4.可以添加任意访问修饰符（public protected 默认 private），因为它的地位就是一个成员。
    public static class Inner{
        public void say(){
            String name = "李四";
            System.out.println(name + " 外部类成员：" + Outer.name);
        }
    }

    public void m(){
        Inner inner = new Inner();
        inner.say();
    }

    public Inner getInner(){
        return new Inner();
    }
    public static Inner getInner1(){
        return new Inner();
    }
}