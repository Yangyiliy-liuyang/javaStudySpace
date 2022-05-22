package com.day0522.innerclass;

public class Main {
    public static void main(String[] args) {

        //当做实参直接传值，简洁高效
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


        //传统方法
        f1(new Picture());
    }

    //静态方法，形参是接口类型
    public static void f1(IL il){
        il.show();
    }
}
interface IL{
    void show();
}

//类实现IL  ----  硬编码
class Picture implements IL{
    @Override
    public void show() {
        System.out.println("....2.....");
    }
}