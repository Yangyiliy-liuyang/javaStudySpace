package com.day0513.Interface02;

public interface IA {
    void cry();
}
interface IB{
    void cry();
}


//接口不能继承其他的类，但是可以继承多个别的接口

interface IC extends IA, IB{
    @Override
    void cry();
}