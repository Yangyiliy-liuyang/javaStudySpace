package com.day0509.Object.Finalize;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("宝马");
        bmw = null;
        // 这时 car对象就是一个垃圾，垃圾回收器就会回收（销毁）对象，在销毁对象前，会调用该对象的finalize方法。
        //程序员就可以在finalize中，写自己的业务逻辑代码（比如释放资源 数据库连接 后者打开文件...）
        //如果程序员不重写finalize，那么就会调用object类的finalize方法，即默认处理。
        System.gc();//主动运行垃圾回收器
        System.out.println("程序退出了");
    }
}
class Car{
    private String name;

    Car(String name) {
        this.name = name;
    }

    //重写finalize方法
    //快捷键输入

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁汽车" + name);
        System.out.println("释放资源");
        //super.finalize();
    }
}