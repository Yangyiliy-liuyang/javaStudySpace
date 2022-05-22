package com.day0508.Polyparameter;

public class Manager extends Empoyee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    void manage(){
        System.out.println("æ≠¿Ì " + getName() + " is managing");
    }
    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
