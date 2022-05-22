package com.day0508.Polyparameter;

public class Main {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager milan = new Manager("milan", 5000, 200000);
        Main main = new Main();
        main.showEmpAnnual(tom);
        main.showEmpAnnual(milan);

        main.testWork(tom);
        main.testWork(milan);
    }
    public void showEmpAnnual(Empoyee e){
        System.out.println(e.getAnnual());
    }
    public void testWork(Empoyee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        }else if (e instanceof Manager){
            ((Manager) e).manage();
        }
    }
}
