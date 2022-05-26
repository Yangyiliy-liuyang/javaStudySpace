package com.day0525.adventure_game;

import javax.swing.*;

/**
 * @author liuyang
 * @student_ID   2020060302
 * 2022/5/25
 * @version 1.0
 * 主菜单
 */
public class MyMain {
    public static void main(String[] args) {

        String menu="\t张三冒险记\n"
                +"\t1.开始挑战\n"
                +"\t2.退出游戏\n"
                ;
        String [] options = {"1","2"};
        Object choice = JOptionPane.showInputDialog(null, //父对话框
                menu, //显示信息
                "开始", //标题
                0, //图标类型
                new ImageIcon("images/开始界面.jpg"), //图片
                options, //输入内容，数组形式放入
                "A")
                ;//默认输入值
        System.out.println(choice);
    }

}
