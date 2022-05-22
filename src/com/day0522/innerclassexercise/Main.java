package com.day0522.innerclassexercise;

public class Main {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("....晴天.....");
            }
        });
        //编译类型 Bell 运行类型 Main.XXXX 再动态绑定回到Main的bell.ring
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("....七里香....");
            }
        });

    }
}
interface Bell{
    void ring();
}
class CellPhone{
    public void alarmClock(Bell bell){
        System.out.println(bell.getClass());
        System.out.println(bell.getClass().getName());
        System.out.println(bell.hashCode());
        bell.ring();
    }
}