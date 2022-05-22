package com.day0507.PolyDetail01;

import com.day0507.PolyDetail01.Cat;
import com.day0507.PolyDetail01.animal;

public class poly {
    public static void main(String[] args) {
        animal animal = new Cat();
        animal.sleep();
        Cat cat = (Cat) animal;
        ((Cat) animal).text();
        animal.eat(cat);
    }
}
