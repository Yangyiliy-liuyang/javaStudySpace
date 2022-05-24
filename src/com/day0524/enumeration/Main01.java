package com.day0524.enumeration;

/**
 * @author yangyiliy_liuyang
 * 2022/5/24
 * @version 1.0
 */


public class Main01 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);
        System.out.println(Season.AUTUMN);
    }
}


enum Season01 {

    SPRING("´ºÌì", "ÎÂÅ¯"),WINTER("¶¬Ìì", "º®Àä"),AUTUMN("ÇïÌì", "Á¹Ë¬"),SUMMER("ÏÄÌì", "Ñ×ÈÈ");
    private String name;
    private String desc;
    Season01(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season01{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}