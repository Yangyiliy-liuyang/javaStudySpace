package com.day0604;

/**
 * @author yangyiliy_liuyang
 * 2022/6/4
 * @version 1.0
 */
public class WatchTower implements Assailable{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public void setHp(int hp) {

    }

    public WatchTower() {
        super();
    }

    @Override
    public void fight(Hero hero) {

    }

    @Override
    public boolean canFightByDistance(Hero hero) {
        return false;
    }
}
