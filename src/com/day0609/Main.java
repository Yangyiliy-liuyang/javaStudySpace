package com.day0609;

import javax.swing.*;
import java.util.Date;
import java.util.Scanner;
/**
 * ��ѡ��Java����̨��
 * @author �����
 * @date 2018��10��12�� ����9:29:37
 * @remarks TODO
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* ��Ů��������*/
        String[] newNameArray = {"���", "��ԲԲ", "��СС", "���", "������"};
        int newNameCount = newNameArray.length;
        /* �������������飬Ԥ��5������ռ�*/
        String[] nnNameArray = {"����", "����", "����", "����", "����", "", "", "", "", ""};
        /* ��������*/
        String[] levelNames = {"����", "����", "����", "�ʹ���", "�ʺ�"};
        /* ����*/
        int[] level = new int[10];
        /* �øж�*/
        int[] loves = new int[10];
        /* ����ĳ�ʼ����Ϊ5*/
        int nnCount = 5;
        int gameDays = 1; //Ĭ����Ϸ����10��

        //�趨Ĭ�Ϻøж�
        for (int i = 0; i < nnCount; i++) {
            loves[i] = 100;
        }
        //��Ϸ��������
        JOptionPane.showMessageDialog(null, "���£�������",
                "��ӭ������ѡ��", 0, new ImageIcon("images/index.jpg"));
        while(gameDays <= 10){
//			System.out.println("��Ϸ���е���" + gameDays + "��");
//			System.out.println("1���ʵ���ּѡ��\t\t�����ӣ�");
//			System.out.println("2�����Ƴ���\t\t�����ҡ��޸�״̬��");
//			System.out.println("3�������乬\t\t��ɾ����");
//			System.out.print("������ѡ��");
//			int choice = input.nextInt();
            String strMenu = "1���ʵ���ּѡ��\n";
            strMenu += "2�����Ƴ���\n";
            strMenu += "3�������乬\n";
            strMenu += "������ѡ��";
            Object objResult = JOptionPane.showInputDialog(null, strMenu, "��" + gameDays + "��",
                    0, new ImageIcon("images/emperor.jpg"),
                    new String[]{"1", "2", "3"},
                    1
            );
            //Ҫ�ж��û�ѡ��ȡ�������
            if(objResult == null){
                break;//�������в���break��continue������,breakֱ�ӽ�����continue�ظ�����ѡ����档
            }
            //���û���ѡ��1-3֮����ַ�����ת��������
            //int choice = Integer.parseInt(objResult.toString());
            switch (objResult.toString()) {
                case "1"://"1���ʵ���ּѡ��\t\t�����ӣ�"
                    if(nnCount == nnNameArray.length){
                        System.out.println("�������ӣ����Ѿ�����Ϊ���ˣ����ɼ������");
                        break;
                    }
//				System.out.print("�������½���������䣺");
//				String newName = input.next();
                    objResult = JOptionPane.showInputDialog(null, "��ѡ����Ů", "ѡ��", 0,
                            new ImageIcon("images/xuanx.jpg"),
                            newNameArray,
                            null
                    );
                    if(objResult == null){
                        break;//�������в���break��continue������,break����ÿ�ս�������ڶ��죻continue���ص�һ�������ѡ����档
                    }
                    JOptionPane.showMessageDialog(null, objResult.toString(), "ѡ�е�����", 0,
                            new ImageIcon("images/" + objResult.toString() + ".jpg") );
                    //�����������飬�øж����飬��������
                    nnNameArray[nnCount] = objResult.toString();
                    loves[nnCount] = 100;
                    //��������øж�-10
                    for (int i = 0; i < nnCount; i++) {
                        loves[i] -= 10;
                    }
                    nnCount++;
                    break;
                case "2"://"2�����Ƴ���\t\t���޸�״̬��" +20 ����-10
//				System.out.print("��������������䣺");
//				String name = input.next();
                    objResult = JOptionPane.showInputDialog(null, "������ѡ��", "����", 0,
                            new ImageIcon("images/����.jpg"),
                            nnNameArray,
                            null
                    );
                    if(objResult == null){
                        break;
                    }
                    //����
                    String name = objResult.toString();
                    int searchIndex = Integer.MIN_VALUE;
                    //Ҫ�����ַ������±�
                    for (int i = 0; i < nnCount; i++) {
                        if(name.compareTo(nnNameArray[i]) == 0){//������ȵ����
                            searchIndex = i;
                            break;
                        }
                    }
                    if(searchIndex == Integer.MIN_VALUE){
                        System.out.println("�������ӣ����޴���");
                        break;
                    }
                    //�ҵ����������ǰ�øж�+20����һ����������-10
                    loves[searchIndex] += 20;
                    if(level[searchIndex] == levelNames.length - 1){
                        JOptionPane.showMessageDialog(null,
                                nnNameArray[searchIndex] + "�����Ѿ�ĸ�����£�����ʧ��",
                                "���ƽ��", 0, new ImageIcon("images/"+ nnNameArray[searchIndex] +".jpg"));
                        //System.out.println(nnNameArray[searchIndex] + "�����Ѿ�ĸ�����£�����ʧ��");
                        //break;
                    }else{
                        level[searchIndex]++;
                        for (int i = 0; i < nnCount; i++) {
                            if(i == searchIndex){  //�ų����Ƴ��ҵ�����
                                continue;
                            }
                            loves[i] -= 10;
                        }
                        //System.out.println("����" + nnNameArray[searchIndex] + ",�øж�+20������Ϊ"+ levelNames[level[searchIndex]] +"�����øж�-10��");
                        JOptionPane.showMessageDialog(null,
                                "����" + nnNameArray[searchIndex] + ",�øж�+20������Ϊ"+ levelNames[level[searchIndex]] +"�����øж�-10��",
                                "���ƽ��", 0, new ImageIcon("images/"+ nnNameArray[searchIndex] +".jpg"));
                    }
                    break;
                case "3"://"3�������乬\t\t��ɾ����"
                    objResult = JOptionPane.showInputDialog(null, "������ѡ��", "�����乬", 0,
                            new ImageIcon("images/Gaogf.jpg"),
                            nnNameArray,
                            null
                    );
                    if(objResult == null){
                        break;
                    }
                    //����
                    String delname = objResult.toString();
                    int delIndex = Integer.MIN_VALUE;
                    for (int i = 0; i < nnCount; i++) {
                        if(delname.compareTo(nnNameArray[i]) == 0){//������ȵ����
                            delIndex = i;
                            break;
                        }
                    }
                    if(delIndex == Integer.MIN_VALUE){
                        System.out.println("�������ӣ����޴���");
                        break;
                    }
                    for (int i = delIndex; i < nnCount; i++) {
                        nnNameArray[i] = nnNameArray[i + 1];
                    }
                    nnCount--;
                    for (int i = 0; i < nnCount; i++) {
                        loves[i] += 10;
                    }
                    JOptionPane.showMessageDialog(null, objResult.toString() + "�����乬,��������øж�+10", "�乬", 0,
                            new ImageIcon("images/" + objResult.toString() + ".jpg") );
                    //System.out.println("����" + nnNameArray[searchIndex] + ",�øж�+20������Ϊ"+ levelNames[level[searchIndex]] +"�����øж�-10��");
                    break;
                default:
                    System.out.println("������1-3֮���������");
                    continue;
            }
//			System.out.println("����\t����\t�øж�");
//			for (int i = 0; i < nnCount; i++) {
//				System.out.println(nnNameArray[i] + "\t" + levelNames[level[i]] + "\t" + loves[i]);
//			}

            //�����3�����ϵ����Ӻøжȶ�����60����ô�������ң���Ϸǿ���˳�
            int count = 0;
            for (int i = 0; i < nnCount; i++) {
                if(loves[i] < 60){
                    count++;
                }
            }
            String resultValue = "����3����������øжȵ���60����������\n";
            resultValue += new Date().toLocaleString();
            if(count >= 3){
                JOptionPane.showMessageDialog(null, resultValue,
                        "ͻ���¼����󹬱���", 0, new ImageIcon("images/����.jpg"));
                System.exit(0);
            }

            //ÿ�ս���
            String value = "�󹬵�������£�\n";
            for (int i = 0; i < nnCount; i++) {
                //System.out.println(nnNameArray[i] + "\t" + levelNames[level[i]] + "\t" + loves[i]);
                value += String.format("%s    %s    %d\n", nnNameArray[i], levelNames[level[i]], loves[i]);
            }
            JOptionPane.showMessageDialog(null, value, "ÿ�ս���", 0, new ImageIcon("images/timg.jpg"));
            gameDays++;
        }
    }
}