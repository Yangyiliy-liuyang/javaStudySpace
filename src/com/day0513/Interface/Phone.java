package com.day0513.Interface;

public class Phone implements UsbInterface{

    @Override
    public void start() {
        System.out.println("�ֻ���ʼ����...");
    }

    @Override
    public void stop() {
        System.out.println("�ֻ�ֹͣ����...");
    }
}
