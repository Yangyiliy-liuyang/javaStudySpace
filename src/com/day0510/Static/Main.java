package com.day0510.Static;

public class Main {
    public static void main(String[] args) {
        //����� �����ص㣺static�������ʱ��ɣ�static�������ж���ʵ������
        //��ǰ��static���ھ�̬������ �����ڶ�class����ײ�
        Chird libai = new Chird("libai");
        libai.join();
        Chird.count++;
        Chird dupu = new Chird("dupu");
        dupu.join();//1850769025
        Chird.count++;
        System.out.println("��" + Chird.count + "������Ϸ");
    }
}
class Chird{
    private String name;
    public static int count = 0;

    public Chird(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name + " ������Ϸ");
    }
}