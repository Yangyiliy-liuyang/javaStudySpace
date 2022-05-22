package com.day0522.innerclass;

public class Main {
    public static void main(String[] args) {

        //����ʵ��ֱ�Ӵ�ֵ������Ч
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("....1.....");
            }
        });

        IL P = new IL(){
            @Override
            public void show() {
                System.out.println("....3.....");
            }
        };
        P.show();


        //��ͳ����
        f1(new Picture());
    }

    //��̬�������β��ǽӿ�����
    public static void f1(IL il){
        il.show();
    }
}
interface IL{
    void show();
}

//��ʵ��IL  ----  Ӳ����
class Picture implements IL{
    @Override
    public void show() {
        System.out.println("....2.....");
    }
}