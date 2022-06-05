package com.day0604;

/**
 * @author yangyiliy_liuyang
 * 2022/6/4
 * @version 1.0
 */
public interface Assailable {
    String getName();
    int getX();
    int getY();
    int getHp();
    void setHp(int hp);
    void fight(Assailable assa);
    boolean canFightByDistance(Assailable assa,int distance1,int distance2);


}
