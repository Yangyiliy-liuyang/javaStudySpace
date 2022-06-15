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
        //返回当前枚举类中所有的常量
        Season[] values = Season.values();
        for (Season i :
                values) {
            System.out.println(i);
        }

        System.out.println();
        //根据输入的name，在Season中查找，如果查到了，就返回给autumu1.
        //找不到就报错
        Season autumn1 = Season.valueOf("AUTUMN");
        System.out.println(autumn1);
        System.out.println(autumn == autumn1);


        //compareTo: 比较两个枚举常量，比较的是编号。
        System.out.println(Season.SPRING.compareTo(Season.SUMMER));//0-3=-3


        System.out.println();
        int[] nums = {1,2,32,31,43};
        //增强for循环
        for (int i :
                nums) {
            System.out.println(i +" ");
        }
    }
}
//抑制警告信息
@SuppressWarnings({"all"})
//表示Season过时了，版本过度。
@Deprecated
enum Season {
    //不能继承其他类了，enum隐式继承Enum
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