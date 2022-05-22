package com.day0512.Final;

public class Main {

}
final class A{
    //使A不能被其他类继承
}
class B{
    public final void hi(){
        //使hi不能被重写
    }
}
class C extends B{
    //@Override
    //public void hi() {
    //    super.hi();
    //}
}