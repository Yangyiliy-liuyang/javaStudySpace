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
    //[����ʽ] ֻ�е��û�����getInstance ʹ��ʱ�Ŵ���
    //1.������˽�л�
    //2.����һ��static��̬���Զ���
    //3.�ṩһ��public����

    private Cat(String name) {
        System.out.println("����������...");
        this.name = name;
    }
    public static Cat getInstance(){
        if(cat==null){
            cat = new Cat("С��");
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