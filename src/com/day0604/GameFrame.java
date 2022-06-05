package com.day0604;

import javax.swing.*;

/**
 * @author yangyiliy_liuyang
 * 2022/6/5
 * @version 1.0
 */
public class GameFrame extends JFrame {
    private int windowWidth = 1400;
    private int windowHeight = 700;

    public void launch(){
        setSize(windowWidth,windowHeight);
        //居中显示
        setLocationRelativeTo(null);
        //关闭窗口，程序自动停止运行。
        setDefaultCloseOperation(3);
        setResizable(false);
        setTitle("王者荣耀");
        setVisible(true);
    }
}
