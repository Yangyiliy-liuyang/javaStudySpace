package com.day0511.CodeBlock;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("��ã����Ӣ");
        System.out.println();
        Movie movie1 = new Movie("���˽�̽��3",100,"��˼��");
    }
}
class Movie {
    private String name;
    private double price;
    private String director;

    //������ ����

    //����� ��ͨ����飬ÿ����һ�����󣬾�ִ��
    {
        System.out.println("��Ӱ��Ļ��...");
        System.out.println("��濪ʼ...");
        System.out.println("��Ӱ��ʽ��ʼ...");
    }
    public Movie(String name) {
        /*
        System.out.println("��Ӱ��Ļ��...");
        System.out.println("��濪ʼ...");
        System.out.println("��Ӱ��ʽ��ʼ...");
        */
        this.name = name;
        System.out.println("���췽��������");
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
        System.out.println("���췽��������");
    }


}