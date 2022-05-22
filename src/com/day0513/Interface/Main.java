package com.day0513.Interface;

public class Main {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(phone);
        System.out.println();
        computer.work(camera);
    }
}
