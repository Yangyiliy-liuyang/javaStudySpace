package com.day0511.CodeBlockDetail;

public class Main {
    public static void main(String[] args) {
        //�౻���ص��������
        //1.��������ʵ��ʱ
        //AA aa = new AA();

        //2.�����������ʵ��ʱ������Ҳ�ᱻ���ء�
        // ���๹����Ҫ�ȼ��أ�����������ڹ���������
        BB bb = new BB();

        //3.ʹ����ľ�̬��Աʱ����̬���ԣ���̬������
        System.out.println(Cat.n1);

        //DD dd = new DD();
        //DD dd1 = new DD();
        //��̬����� ������ļ��ض�ִ�У�����ֻ��ִ��һ��
        //��ͨ�Ĵ���� �ڴ�������ʵ����ʱ�򣬻ᱻ��ʽ�ĵ��á�
        //������һ�Σ��ͻᱻ����һ�Ρ�
        //���ֻ��ʹ����ľ�̬��Աʱ����ͨ����鲢����ִ�С�
        //���Լ򵥵����Ϊ��ͨ������ǹ������Ĳ��䣬û�е��ù�������û��ʹ�ô���顣
        System.out.println(DD.n1);
        //��̬�����һ����ִ��
    }
}
class DD{
    public static int n1 = 999;
    static{
        System.out.println("DD �ľ�̬����鱻ִ��...");
    }
    {
        System.out.println("DD ����ͨ����鱻ִ��...");
    }
}
class Cat{
    public static int n1 = 999;
    static{
        System.out.println("Cat �ľ�̬����鱻ִ��...");
    }
}
class AA{

    //��̬����� ������ļ��ض�ִ�У�����ֻ��ִ��һ�Ρ�
    static{
        System.out.println("AA �ľ�̬����鱻ִ��...");
    }
}
class BB extends AA{

    //��̬�����
    static{
        System.out.println("BB �ľ�̬����鱻ִ��...");
    }
}