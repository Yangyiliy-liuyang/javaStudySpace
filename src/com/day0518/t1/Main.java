package com.day0518.t1;

/**
 * @author yangyiliy
 */
public class Main {
	public static void main(String[] args) {
		Cir cir1 = new Cir(10,12); 
		cir1.getVolume();
		System.out.println();
		Rectangle rectangle = new Rectangle(10, 20, 30, 40);
		rectangle.getVolume();
		System.out.println();
		Trapezoid trapezoid = new Trapezoid(6, 13, 11);
		trapezoid.getVolume();
	}
	
}
