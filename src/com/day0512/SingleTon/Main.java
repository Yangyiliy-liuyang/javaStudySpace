package com.day0512.SingleTon;

public class Main {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        GirlFriend instance1 = GirlFriend.getInstance();
        System.out.println(instance1);
        System.out.println();
        System.out.println(instance==instance1);
    }
}

//ֻ����һ��Ů����
class GirlFriend{
    private String name;
    //[����ģʽ--����ʽ] ������ɴ����˶���û��ʹ�ã�����˷ѡ�
    //��α���ֻ�ܴ���һ��Ů����
    //1.��������˽�л�
    //2.������ڲ�ֱ�Ӵ�������static��
    //3.�ṩһ��������static����������gf����

    private static GirlFriend gf = new GirlFriend("С��");
    //Ϊ���ܹ��ھ�̬�����з���gf���� ��Ҫ��������Ϊstatic

    private GirlFriend(String name) {
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}