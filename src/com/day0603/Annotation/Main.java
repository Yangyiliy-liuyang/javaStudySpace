package com.day0603.Annotation;

/**
 * @author yangyiliy_liuyang
 * 2022/6/4
 * @version 1.0
 */
public class Main {
  @SuppressWarnings({"rawtypes","all"})//���ƾ�������
  //����λ��@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
  //����ʱ��@Retention(RetentionPolicy.SOURCE)
    public static void main(String[] args) {
        A a;
    }
}
class Father{
    public void fly(){
        System.out.println("Father fly...");
    }
}
class Son extends Father{
    @Override//��д�˸��෽�����﷨У��
    public void fly() {
        System.out.println("Son fly...");
    }
}

@Deprecated//��ʾ��ʱ���汾��������ʹ��
class A{

}