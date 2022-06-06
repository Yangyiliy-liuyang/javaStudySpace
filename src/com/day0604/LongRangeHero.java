package com.day0604;

/**
 * @author yangyiliy_liuyang
 * 2022/6/4
 * @version 1.0
 */
public abstract class LongRangeHero extends Hero{
    private int attackRange;

    public LongRangeHero(long id, String name, int level, int x, int y, int maxHp,int distance, int ATK) {
        super(id, name, level, x, y, maxHp, distance, ATK);
    }

    @Override
    public void fight(Assailable assa) {
        super.fight(assa);
    }

    @Override
    public boolean canFightByDistance(Assailable assa) {
        return false;
    }
}
