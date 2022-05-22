package com.day0513.Interface03;

public class  Main01 {
    public static void main(String[] args) {
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone();
        usbs[1] = new Camera();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            if(usbs[i] instanceof Phone){
                ((Phone) usbs[i]).call();
            }
        }
    }
}
interface Usb{
    void work();
}
class Phone implements Usb{
    public void call(){
        System.out.println("�ֻ���绰...");
    }

    @Override
    public void work() {
        System.out.println("�ֻ�������...");
    }
}
class Camera implements Usb{

    @Override
    public void work() {
        System.out.println("���������...");
    }
}