package com.day0509.Object.Finalize;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("����");
        bmw = null;
        // ��ʱ car�������һ�������������������ͻ���գ����٣����������ٶ���ǰ������øö����finalize������
        //����Ա�Ϳ�����finalize�У�д�Լ���ҵ���߼����루�����ͷ���Դ ���ݿ����� ���ߴ��ļ�...��
        //�������Ա����дfinalize����ô�ͻ����object���finalize��������Ĭ�ϴ���
        System.gc();//������������������
        System.out.println("�����˳���");
    }
}
class Car{
    private String name;

    Car(String name) {
        this.name = name;
    }

    //��дfinalize����
    //��ݼ�����

    @Override
    protected void finalize() throws Throwable {
        System.out.println("������������" + name);
        System.out.println("�ͷ���Դ");
        //super.finalize();
    }
}