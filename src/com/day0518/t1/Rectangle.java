package com.day0518.t1;

public class Rectangle implements Area{
	double upp,down,h,H;
	
	public Rectangle(double upp, double down, double h, double h2) {
		super();
		this.upp = upp;
		this.down = down;
		this.h = h;
		H = h2;
	}



	@Override
	public void getVolume() {
		@SuppressWarnings("unused")
		double res = (double)((upp+down)*h/2/3*H);
		System.out.print("底为梯形的锥形体积为" + res);
	}
}
