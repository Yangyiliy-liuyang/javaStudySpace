package com.day0518.t1;

public class Trapezoid implements Area{
	double l,w,H;
	
	public Trapezoid(double l, double w, double h) {
		super();
		this.l = l;
		this.w = w;
		H = h;
	}

	@Override
	public void getVolume() {
		@SuppressWarnings("unused")
		double res = (double)(l*w/3*H);
		System.out.print("底为矩形的锥形体积为" + res);
	}
}
