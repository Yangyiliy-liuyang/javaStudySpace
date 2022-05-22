package com.day0511.CodeBlock;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("你好，李焕英");
        System.out.println();
        Movie movie1 = new Movie("唐人街探案3",100,"陈思诚");
    }
}
class Movie {
    private String name;
    private double price;
    private String director;

    //构造器 重载

    //代码块 普通代码块，每创建一个对象，就执行
    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始...");
    }
    public Movie(String name) {
        /*
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始...");
        */
        this.name = name;
        System.out.println("构造方法被调用");
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
        System.out.println("构造方法被调用");
    }


}