package com.day0609;

import javax.swing.*;
import java.util.Date;
import java.util.Scanner;
/**
 * 后宫选妃Java控制台版
 * @author 棣哩哩
 * @date 2018年10月12日 上午9:29:37
 * @remarks TODO
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* 美女姓名数组*/
        String[] newNameArray = {"褒姒", "陈圆圆", "苏小小", "甄嬛", "钟无艳"};
        int newNameCount = newNameArray.length;
        /* 后宫娘娘姓名数组，预留5个名额空间*/
        String[] nnNameArray = {"张三", "李四", "王五", "周六", "嘉祺", "", "", "", "", ""};
        /* 级别数组*/
        String[] levelNames = {"贵人", "嫔妃", "贵妃", "皇贵妃", "皇后"};
        /* 级别*/
        int[] level = new int[10];
        /* 好感度*/
        int[] loves = new int[10];
        /* 娘娘的初始数量为5*/
        int nnCount = 5;
        int gameDays = 1; //默认游戏运行10天

        //设定默认好感度
        for (int i = 0; i < nnCount; i++) {
            loves[i] = 100;
        }
        //游戏的主界面
        JOptionPane.showMessageDialog(null, "陛下，您来啦",
                "欢迎来到后宫选妃", 0, new ImageIcon("images/index.jpg"));
        while(gameDays <= 10){
//			System.out.println("游戏进行到第" + gameDays + "天");
//			System.out.println("1、皇帝下旨选妃\t\t（增加）");
//			System.out.println("2、翻牌宠幸\t\t（查找、修改状态）");
//			System.out.println("3、打入冷宫\t\t（删除）");
//			System.out.print("陛下请选择：");
//			int choice = input.nextInt();
            String strMenu = "1、皇帝下旨选妃\n";
            strMenu += "2、翻牌宠幸\n";
            strMenu += "3、打入冷宫\n";
            strMenu += "陛下请选择：";
            Object objResult = JOptionPane.showInputDialog(null, strMenu, "第" + gameDays + "天",
                    0, new ImageIcon("images/emperor.jpg"),
                    new String[]{"1", "2", "3"},
                    1
            );
            //要判断用户选择取消的情况
            if(objResult == null){
                break;//可以自行测试break和continue的区别,break直接结束；continue重复出现选择界面。
            }
            //将用户的选择（1-3之间的字符串）转换成整型
            //int choice = Integer.parseInt(objResult.toString());
            switch (objResult.toString()) {
                case "1"://"1、皇帝下旨选妃\t\t（增加）"
                    if(nnCount == nnNameArray.length){
                        System.out.println("大猪蹄子，后宫已经人满为患了，不可继续纳妾");
                        break;
                    }
//				System.out.print("请输入新晋娘娘的名讳：");
//				String newName = input.next();
                    objResult = JOptionPane.showInputDialog(null, "请选择秀女", "选妃", 0,
                            new ImageIcon("images/xuanx.jpg"),
                            newNameArray,
                            null
                    );
                    if(objResult == null){
                        break;//可以自行测试break和continue的区别,break跳到每日结算后进入第二天；continue跳回第一天陛下请选择界面。
                    }
                    JOptionPane.showMessageDialog(null, objResult.toString(), "选中的嫔妃", 0,
                            new ImageIcon("images/" + objResult.toString() + ".jpg") );
                    //增加姓名数组，好感度数组，级别数组
                    nnNameArray[nnCount] = objResult.toString();
                    loves[nnCount] = 100;
                    //其他娘娘好感度-10
                    for (int i = 0; i < nnCount; i++) {
                        loves[i] -= 10;
                    }
                    nnCount++;
                    break;
                case "2"://"2、翻牌宠幸\t\t（修改状态）" +20 其他-10
//				System.out.print("请输入娘娘的名讳：");
//				String name = input.next();
                    objResult = JOptionPane.showInputDialog(null, "陛下请选择", "翻牌", 0,
                            new ImageIcon("images/翻牌.jpg"),
                            nnNameArray,
                            null
                    );
                    if(objResult == null){
                        break;
                    }
                    //查找
                    String name = objResult.toString();
                    int searchIndex = Integer.MIN_VALUE;
                    //要查找字符串的下标
                    for (int i = 0; i < nnCount; i++) {
                        if(name.compareTo(nnNameArray[i]) == 0){//姓名相等的情况
                            searchIndex = i;
                            break;
                        }
                    }
                    if(searchIndex == Integer.MIN_VALUE){
                        System.out.println("大猪蹄子，查无此人");
                        break;
                    }
                    //找到的情况：当前好感度+20并升一级，其他人-10
                    loves[searchIndex] += 20;
                    if(level[searchIndex] == levelNames.length - 1){
                        JOptionPane.showMessageDialog(null,
                                nnNameArray[searchIndex] + "娘娘已经母仪天下，升级失败",
                                "翻牌结果", 0, new ImageIcon("images/"+ nnNameArray[searchIndex] +".jpg"));
                        //System.out.println(nnNameArray[searchIndex] + "娘娘已经母仪天下，升级失败");
                        //break;
                    }else{
                        level[searchIndex]++;
                        for (int i = 0; i < nnCount; i++) {
                            if(i == searchIndex){  //排除翻牌宠幸的妃子
                                continue;
                            }
                            loves[i] -= 10;
                        }
                        //System.out.println("宠幸" + nnNameArray[searchIndex] + ",好感度+20，升级为"+ levelNames[level[searchIndex]] +"其他好感度-10：");
                        JOptionPane.showMessageDialog(null,
                                "宠幸" + nnNameArray[searchIndex] + ",好感度+20，升级为"+ levelNames[level[searchIndex]] +"其他好感度-10：",
                                "翻牌结果", 0, new ImageIcon("images/"+ nnNameArray[searchIndex] +".jpg"));
                    }
                    break;
                case "3"://"3、打入冷宫\t\t（删除）"
                    objResult = JOptionPane.showInputDialog(null, "陛下请选择", "打入冷宫", 0,
                            new ImageIcon("images/Gaogf.jpg"),
                            nnNameArray,
                            null
                    );
                    if(objResult == null){
                        break;
                    }
                    //查找
                    String delname = objResult.toString();
                    int delIndex = Integer.MIN_VALUE;
                    for (int i = 0; i < nnCount; i++) {
                        if(delname.compareTo(nnNameArray[i]) == 0){//姓名相等的情况
                            delIndex = i;
                            break;
                        }
                    }
                    if(delIndex == Integer.MIN_VALUE){
                        System.out.println("大猪蹄子，查无此人");
                        break;
                    }
                    for (int i = delIndex; i < nnCount; i++) {
                        nnNameArray[i] = nnNameArray[i + 1];
                    }
                    nnCount--;
                    for (int i = 0; i < nnCount; i++) {
                        loves[i] += 10;
                    }
                    JOptionPane.showMessageDialog(null, objResult.toString() + "打入冷宫,其他娘娘好感度+10", "冷宫", 0,
                            new ImageIcon("images/" + objResult.toString() + ".jpg") );
                    //System.out.println("宠幸" + nnNameArray[searchIndex] + ",好感度+20，升级为"+ levelNames[level[searchIndex]] +"其他好感度-10：");
                    break;
                default:
                    System.out.println("请输入1-3之间的整数！");
                    continue;
            }
//			System.out.println("姓名\t级别\t好感度");
//			for (int i = 0; i < nnCount; i++) {
//				System.out.println(nnNameArray[i] + "\t" + levelNames[level[i]] + "\t" + loves[i]);
//			}

            //如果有3个以上的妃子好感度都低于60，那么发生暴乱，游戏强制退出
            int count = 0;
            for (int i = 0; i < nnCount; i++) {
                if(loves[i] < 60){
                    count++;
                }
            }
            String resultValue = "后宫有3个以上娘娘好感度低于60，发生暴乱\n";
            resultValue += new Date().toLocaleString();
            if(count >= 3){
                JOptionPane.showMessageDialog(null, resultValue,
                        "突发事件：后宫暴乱", 0, new ImageIcon("images/暴乱.jpg"));
                System.exit(0);
            }

            //每日结算
            String value = "后宫的情况如下：\n";
            for (int i = 0; i < nnCount; i++) {
                //System.out.println(nnNameArray[i] + "\t" + levelNames[level[i]] + "\t" + loves[i]);
                value += String.format("%s    %s    %d\n", nnNameArray[i], levelNames[level[i]], loves[i]);
            }
            JOptionPane.showMessageDialog(null, value, "每日结算", 0, new ImageIcon("images/timg.jpg"));
            gameDays++;
        }
    }
}