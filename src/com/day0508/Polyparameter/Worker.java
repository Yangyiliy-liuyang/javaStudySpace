package com.day0508.Polyparameter;

public class Worker extends Empoyee{
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("��ͨԱ�� " + getName() + " is working");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();//��ͨԱ��û����������
    }
}
