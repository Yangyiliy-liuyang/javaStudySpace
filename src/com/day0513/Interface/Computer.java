package com.day0513.Interface;

public class Computer {

    //��дһ���������������ʼ������

    public void work(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.stop();
    }
}
