package com.day0603.Annotation;

/**
 * @author yangyiliy_liuyang
 * 2022/6/4
 * @version 1.0
 */
public class Main {
  @SuppressWarnings({"rawtypes","all"})//抑制警告类型
  //修饰位置@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
  //保留时间@Retention(RetentionPolicy.SOURCE)
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
    @Override//重写了父类方法，语法校验
    public void fly() {
        System.out.println("Son fly...");
    }
}

@Deprecated//表示过时，版本升级过度使用
class A{

}