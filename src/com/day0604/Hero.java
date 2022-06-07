package com.day0604;

/**
 * @author yangyiliy_liuyang
 * 2022/6/4
 * @version 1.0
 */
//抑制警告信息
//@SuppressWarnings({"all"})
public abstract class Hero implements Assailable{
    private long id;
    private String name;
    private int level;
    private int x;
    private int y;
    //最大生命值
    private int maxHp;
    //当前生命值
    private int Hp;
    private int ATK;
    //攻击距离
    private int distance;
    public Hero(long id, String name, int level, int x, int y, int maxHp,int distance, int ATK) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.x = x;
        this.y = y;
        this.maxHp = maxHp;
        this.Hp = maxHp;
        this.distance = distance;
        this.ATK = ATK;
    }

    public Hero() {
    }

    @Override
    public String toString() {
        return "\t" + name +
                "  id=" + id +
                ", name=" + name +
                ", level=" + level +
                ", x=" + x +
                ", y=" + y +
                ", maxHp=" + maxHp +
                ", Hp=" + Hp +
                ", ATK=" + ATK +
                ", distance=" + distance +
                '.';
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getHp() {
        return Hp;
    }

    @Override
    public void setHp(int hp) {
        this.Hp = Hp;
    }

    @Override
    public void fight(Hero hero) {
        if(this.canFightByDistance(hero) == true){
            System.out.println("你攻击了敌方英雄,造成了" + this.ATK + "点伤害！");
            hero.Hp-=this.ATK;
        }
    }

    @Override
    public boolean canFightByDistance(Hero hero) {
        boolean flag = false;
        double mindistance = Math.sqrt(Math.abs((this.getX() - hero.getX())*
                (this.getX() - hero.getX())+(this.getY() - hero.getY())* (this.getY() - hero.getY())));
        if(mindistance < this.distance ){
            //玩家可以打到敌方英雄，敌方攻击距离不够
            flag = true;
        }
        return  flag;
    }
}
