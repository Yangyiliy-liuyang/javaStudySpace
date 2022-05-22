package com.day0511.CodeBlockDetail;

public class Main {
    public static void main(String[] args) {
        //类被加载的情况举例
        //1.创建对象实例时
        //AA aa = new AA();

        //2.创建子类对象实例时，父类也会被加载。
        // 父类构造器要先加载，而代码块先于构造器加载
        BB bb = new BB();

        //3.使用类的静态成员时（静态属性，静态方法）
        System.out.println(Cat.n1);

        //DD dd = new DD();
        //DD dd1 = new DD();
        //静态代码块 随着类的加载而执行，并且只会执行一次
        //普通的代码块 在创建对象实例的时候，会被隐式的调用。
        //被创建一次，就会被调用一次。
        //如果只是使用类的静态成员时，普通代码块并不会执行。
        //可以简单的理解为普通代码块是构造器的补充，没有调用构造器就没有使用代码块。
        System.out.println(DD.n1);
        //静态代码块一定会执行
    }
}
class DD{
    public static int n1 = 999;
    static{
        System.out.println("DD 的静态代码块被执行...");
    }
    {
        System.out.println("DD 的普通代码块被执行...");
    }
}
class Cat{
    public static int n1 = 999;
    static{
        System.out.println("Cat 的静态代码块被执行...");
    }
}
class AA{

    //静态代码块 随着类的加载而执行，并且只会执行一次。
    static{
        System.out.println("AA 的静态代码块被执行...");
    }
}
class BB extends AA{

    //静态代码块
    static{
        System.out.println("BB 的静态代码块被执行...");
    }
}