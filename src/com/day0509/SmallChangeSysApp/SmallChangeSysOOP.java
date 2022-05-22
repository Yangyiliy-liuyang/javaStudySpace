package com.day0509.SmallChangeSysApp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key;
    String details = "-------------零钱通明细-------------";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note = "";
    public void mainMenu() {
        do {
            System.out.println("=============零钱通菜单=============");
            System.out.println("\t\t\t1. 零钱通明细");
            System.out.println("\t\t\t2. 收益入账");
            System.out.println("\t\t\t3. 消费");
            System.out.println("\t\t\t4. 退出");

            System.out.println("请选择（1~4）");
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
                    System.out.println("输入错误，请重新输入:");
                    break;
            }
        }while(loop);
    }
    public void detail() {
        System.out.println(details);
    }
    public void income() {
        System.out.println("收益入账金额:");
        money = scanner.nextDouble();
        if(money <= 0){
            System.out.println("收益金额需要大于0元");
            return;
        }
        balance += money;
        date = new Date();
        details += "\n受益入账\t" + money + "\t" + sdf.format(date) + "\t "+ balance;
        return;
    }
    public void pay() {
        System.out.println("消费金额:");
        money =scanner.nextDouble();
        if(money <= 0 || money > balance){
            System.out.println("消费金额需要大于0元并且不超过余额");
            return;
        }
        System.out.println("消费说明:");
        note = scanner.next();
        balance -= money;
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t "+ balance;
        return;
    }
    public void exit() {
        String choice = "";
        do {
            //用户必须输入y/n，否则一直循环。
            System.out.println("你要退出吗？（y/n）");
            choice = scanner.next();
        } while (!"y".equals(choice) && !"n".equals(choice));
        //当用户退出while，进行判断。
        if("y".equals(choice)) {
            loop = false;
        }
        return;
    }
}
