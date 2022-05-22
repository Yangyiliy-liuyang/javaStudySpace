package com.day0508.ToString;

public class Main {
    public static void main(String[] args) {
        Monster monster = new Monster("С����","Ѳɽ��",1000);
        System.out.println(monster.toString() + " hashCode=" + monster.hashCode());
        /*
        Object��toString����
        public String toString() {
        //getClass().getName() ���ȫ����������+������
        //Integer.toHexString(hashCode()) �������hashCodeת��16�����ַ���
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        */
        System.out.println(monster);
    }
}
class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    //��дtoString�����������������ԡ�
    //ʹ�ÿ�ݼ� alt+ins toString()
    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}
