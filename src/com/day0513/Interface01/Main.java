package com.day0513.Interface01;

public class Main {
    public static void main(String[] args) {

    }
}

//���һ���� implements(ʵ��) �ӿ�

//�ӿڲ��ܱ�ʵ����
//�ӿ������з�������public�������ӿ��г��󷽷������Բ���abstract����
//һ����ͨ��ʵ�ֽӿڣ���Ҫ���ýӿڵ����г��󷽷���ʵ��
//������ʵ�ֽӿڣ����Բ�ʵ�ֽӿڵĳ��󷽷���

class A implements Interface{
    @Override
    public void hi() {
        System.out.println("hihihi...");
    }
}
class B implements Interface{

    @Override
    public void hi() {
        System.out.println("hihihi...");
    }

    @Override
    public void ok() {
        Interface.super.ok();
    }
}
abstract class C implements Interface{

}