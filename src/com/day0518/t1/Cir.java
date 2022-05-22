package com.day0518.t1;

public class Cir implements Area{
	double r,H;
	
	public Cir(double r,double H) {
		super();
		this.r = r;
		this.H = H;
	}

	public void getVolume() {
		double res = (double)(3.14*r*r/3);
		System.out.print("底为园的锥形体积为" + res*H);
	}
}
