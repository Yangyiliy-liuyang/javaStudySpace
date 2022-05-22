package com.day0513.Interface;

public class Computer {

    //编写一个方法，计算机开始工作。

    public void work(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.stop();
    }
}
