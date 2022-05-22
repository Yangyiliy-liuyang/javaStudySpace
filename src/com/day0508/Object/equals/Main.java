package com.day0508.Object.equals;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = a;
        /*
        == 比较运算符
        判断基本类型是否相等
        判断引用类型地址是否相等
        */
        System.out.println(a==b);//true
        System.out.println(a==c);//true

        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);

        //ctrl+b
        "hello".equals("abc");
        /*
        String的eauals方法，把默Object的eauals方法重写了，变成了比较两个字符串的值是否相等。
        public boolean equals(Object anObject) {
        if (this == anObject) {//如果是同一个对象
            return true;
        }
        return (anObject instanceof String aString)//判断类型
                && (!COMPACT_STRINGS || this.coder == aString.coder)//判断字符长度相等
                && StringLatin1.equals(value, aString.value);//判断字符相等
    }
         */

        //Object
        /*
        public boolean equals(Object obj) {
            return (this == obj);
            //Object的eauals方法默认就是比较对象地址是否相等
            //也就是判断两个对象是不是同一个对象
        }
        */

        Integer integer1 = new Integer(5);
        /*
        public boolean equals(Object obj) {
        if (obj instanceof Integer) {//判断是不是Integer
            return value == ((Integer)obj).intValue();//判断值是否相等
        }
        return false;
    }
         */
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true

        Integer integer2 = new Integer(5);
        System.out.println(integer1 == integer2);//false
        System.out.println(integer1.equals(integer2));//true
    }
}
class A{ }