package com.day0604;

/**
 * @author yangyiliy_liuyang
 * 2022/6/4
 * @version 1.0
 */
public class Ranger extends LongRangeHero{
    public Ranger(long id, String name, int level, int x, int y, int maxHp,int distance, int ATK) {
        super(id, name, level, x, y, maxHp, distance, ATK);
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
