package com.day0604;

/**
 * @author yangyiliy_liuyang
 * 2022/6/4
 * @version 1.0
 */
public class Warrior extends Hero{
    public Warrior(long id, String name, int level, int x, int y, int maxHp,int distance, int ATK) {
        super(id, name, level, x, y, maxHp, distance, ATK);
    }

    public Warrior() {
    }

    @Override
    public int getLevel() {
        return super.getLevel();
    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level);
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }

    @Override
    public int getATK() {
        return super.getATK();
    }

    @Override
    public void setATK(int ATK) {
        super.setATK(ATK);
    }

    @Override
    public int getDistance() {
        return super.getDistance();
    }

    @Override
    public void setDistance(int distance) {
        super.setDistance(distance);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public int getHp() {
        return super.getHp();
    }

    @Override
    public void setHp(int hp) {
        super.setHp(hp);
    }

    @Override
    public void fight(Hero hero) {
        super.fight(hero);
    }

    @Override
    public boolean canFightByDistance(Hero hero) {
        return super.canFightByDistance(hero);
    }
}
