package com.day0509.SmallChangeSys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key;
        String details = "-------------��Ǯͨ��ϸ-------------";
        double money = 0;
        double balance = 0;
        Date date = null;
        //date��java.util.Date ���ͣ���ʾ���ڡ�
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String note = "";

        //1.��ʾ�˵�
        do {
            System.out.println("=============��Ǯͨ�˵�=============");
            System.out.println("\t\t\t1. ��Ǯͨ��ϸ");
            System.out.println("\t\t\t2. ��������");
            System.out.println("\t\t\t3. ����");
            System.out.println("\t\t\t4. �˳�");

            System.out.println("��ѡ��1~4��");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("�������˽��:");
                    money = scanner.nextDouble();
                    if(money <= 0){
                        System.out.println("��������Ҫ����0Ԫ");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    details += "\n��������\t" + money + "\t" + sdf.format(date) + "\t "+ balance;
                    break;
                case "3":
                    System.out.println("���ѽ��:");
                    money =scanner.nextDouble();
                    if(money <= 0 || money <= balance){
                        System.out.println("���ѽ����Ҫ����0Ԫ���Ҳ��������");
                        break;
                    }
                    System.out.println("����˵��:");
                    note = scanner.next();
                    balance -= money;
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t "+ balance;
                    break;
                case "4":
                    String choice = "";
                    do {
                        //�û���������y/n������һֱѭ����
                        System.out.println("��Ҫ�˳��𣿣�y/n��");
                        choice = scanner.next();
                    } while (!"y".equals(choice) && !"n".equals(choice));
                    //���û��˳�while�������жϡ�
                    if("y".equals(choice)) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("�����������������:");
                    break;
            }
        }while(loop);

        System.out.println("�����˳���Ǯͨ...");

    }
}
