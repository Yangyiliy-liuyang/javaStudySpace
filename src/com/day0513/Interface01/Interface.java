package com.day0513.Interface01;

public interface Interface {
    //���� ����

    int n1 = 10;
    //�ȼ��� public static final int n1 = 10;

    public void hi();
    //abstract public void hi();
    //�ڽӿ��У����󷽷�������ʡ��abstract�ؼ��֡�

    //��jdk8�󣬿�����Ĭ��ʵ�ַ�������Ҫʹ��default�ؼ������Ρ�

    default public void ok(){
        System.out.println("okokok...");
    }

    //��jdk8�󣬿����о�̬������

    public static void cry(){
        System.out.println("cry...");
    }
}
