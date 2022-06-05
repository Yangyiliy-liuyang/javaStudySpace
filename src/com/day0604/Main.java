package com.day0604;

import java.util.Scanner;

/**
 * @author yangyiliy_liuyang
 * 2022/6/4
 * @version 1.0
 */
public class Main {
    public static void menu() throws InterruptedException {
        Hero palyer = new Warrior();
        Hero kai = new Warrior(00012, "凯", 1, 0, 0, 200, 5, 28);
        Hero caocao = new Warrior(00013, "曹操", 1, 0, 0, 200, 6, 27);
        Hero liubei = new Warrior(00022, "刘备", 2, 100, 100, 150, 10, 35);
        Hero zhubajie = new Warrior(00023, "猪八戒", 1, 100, 100, 200, 5, 25);
        System.out.println("          -------------------");
        System.out.println("        -|                   |-");
        System.out.println("         |      王者荣耀       |");
        System.out.println("        -|                   |-");
        System.out.println("          -------------------");
        System.out.print("              loading");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println(".");
        System.out.println("请选择你的英雄:");
        System.out.println("1.凯\t" + "2.曹操");
        Scanner scanner = new Scanner(System.in);
        int choice = 1;//scanner.nextInt();
        if (choice == 1) {
            System.out.println("你的英雄信息为:" + kai);
            palyer = kai;
        } else if (choice == 2) {
            System.out.println("你的英雄信息为:" + caocao);
            palyer = caocao;
        }
        System.out.println("-----------------------------------------");
        System.out.println("|  *               *                *    |");
        System.out.println("|                                        |");
        System.out.println("|                                        |");
        System.out.println("|                                        |");
        System.out.println("|                                   *    |");
        System.out.println("|                                        |");
        System.out.println("|                                        |");
        System.out.println("|                                        |");
        System.out.println("|                                   *    |");
        System.out.println("|                                        |");
        System.out.println("|#                                       |");
        System.out.println("-----------------------------------------");
        System.out.println("操作你的英雄！攻击敌方水晶，获得游戏胜利。");
        System.out.println("你选择:" + "\n1.上路\t2.中路\t3.下路");
        choice = 1;//scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println(palyer.getName() + "向上路移动了" + palyer.getDistance() + "个距离");
                palyer.setY(palyer.getDistance());
                break;
            case 2:
                System.out.println(palyer.getName() + "向中路移动了" + palyer.getDistance() + "个距离");
                palyer.setX((int) (Math.sqrt(2) * palyer.getDistance()));
                palyer.setY((int) (Math.sqrt(2) * palyer.getDistance()));
                break;
            case 3:
                System.out.println(palyer.getName() + "向下路移动了" + palyer.getDistance() + "个距离");
                palyer.setX(palyer.getDistance());
                break;
        }
        System.out.println("继续移动...");
    }
    public static void main(String[] args) throws InterruptedException {
        menu();
        //GameFrame gameFrame = new GameFrame();
        //gameFrame.launch();
    }

}
