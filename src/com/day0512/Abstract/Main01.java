package com.day0512.Abstract;


public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
//���󷽷�����ʹ��private��final �� static�����Σ���Ϊ��Щ�ؼ��ֶ��Ǻ���д��Υ����
abstract class H {
    public abstract void hi();//���󷽷�
}

//���һ����̳��˳����࣬��������ʵ�ֳ���������г��󷽷����������Լ�Ҳ����Ϊabstract��
abstract class E {
    public abstract void hi();
}
abstract class F extends E {

}
class G extends E {
    @Override
    public void hi() { //���������G����ʵ���˸���E�ĳ��󷽷�����νʵ�ַ����������з�����

    }
}

//������ı��ʻ����࣬���Կ�������ĸ��ֳ�Ա
abstract class D {
    public int n1 = 10;
    public static  String name = "��˳ƽ����";
    public void hi() {
        System.out.println("hi");
    }
    public abstract void hello();
    public static void ok() {
        System.out.println("ok");
    }
}
