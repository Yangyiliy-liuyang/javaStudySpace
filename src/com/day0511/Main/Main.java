package com.day0511.Main;

public class Main {
    private static String name = "hello world";
    public static void hi(){
        System.out.println("hello");
    }
    private int n1 = 100;
    public void cry(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        //1.��̬����main ���Է��ʱ���ľ�̬��Ա
        System.out.println(name);
        hi();
        //2.��̬����main �����Է��ʱ���ķǾ�̬��Ա
        //System.out.println(n1);
        //cry();
        //3.��̬����main Ҫ���ʱ���ķǾ�̬��Ա����Ҫ�ȴ��������ٵ��á�
        Main main = new Main();
        System.out.println(main.n1);
        main.cry();
    }
}
