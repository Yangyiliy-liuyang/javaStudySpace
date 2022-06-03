package com.day0602.EnumDetails;

/**
 * @author yangyiliy_liuyang
 * 2022/6/2
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
       Season autumn = Season.AUTUMN;
        System.out.println(autumn.name());
        //输出该枚举对象的次序、编号，从零开始。
        System.out.println(autumn.ordinal());//2
        Season[] values = Season.values();
        for (Season i :
                values) {
            System.out.println(i.toString());
        }
        System.out.println();
        int[] nums = {1,2,32,31,43};
        //增强for循环
        for (int i :
                nums) {
            System.out.println(i +" ");
        }
    }
}
enum Season {

    SPRING("春天", "温暖"),
    WINTER("冬天", "寒冷"),
    AUTUMN("秋天", "凉爽"),
    SUMMER("夏天", "炎热");
    private String name;
    private String desc;
    Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}