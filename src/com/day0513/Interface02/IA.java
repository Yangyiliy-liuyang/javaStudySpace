package com.day0513.Interface02;

public interface IA {
    void cry();
}
interface IB{
    void cry();
}


//�ӿڲ��ܼ̳��������࣬���ǿ��Լ̳ж����Ľӿ�

interface IC extends IA, IB{
    @Override
    void cry();
}