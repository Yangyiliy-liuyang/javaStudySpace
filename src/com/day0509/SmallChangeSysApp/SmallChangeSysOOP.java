package com.day0509.SmallChangeSysApp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key;
    String details = "-------------��Ǯͨ��ϸ-------------";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note = "";
    public void mainMenu() {
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
                    this.detail();
                    break;
                case "2":
                   this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                   this.exit();
                    break;
                default:
                    System.out.println("�����������������:");
                    break;
            }
        }while(loop);
    }
    public void detail() {
        System.out.println(details);
    }
    public void income() {
        System.out.println("�������˽��:");
        money = scanner.nextDouble();
        if(money <= 0){
            System.out.println("��������Ҫ����0Ԫ");
            return;
        }
        balance += money;
        date = new Date();
        details += "\n��������\t" + money + "\t" + sdf.format(date) + "\t "+ balance;
        return;
    }
    public void pay() {
        System.out.println("���ѽ��:");
        money =scanner.nextDouble();
        if(money <= 0 || money > balance){
            System.out.println("���ѽ����Ҫ����0Ԫ���Ҳ��������");
            return;
        }
        System.out.println("����˵��:");
        note = scanner.next();
        balance -= money;
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t "+ balance;
        return;
    }
    public void exit() {
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
        return;
    }
}
