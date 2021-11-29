package com.onb.assignments;

public class Challenge2 {
	public double area(double radius)
	{
		if(radius>0) {
		double area =(3.14)*radius*radius;
		return area;
		}
		else
			return -1.0;
	}
	
	public double area(double x, double y) {
		if(x>0&&y>0) 
		{
		double area = x*y;
		return area;
		}
		else
			return -1.0;	
	}
	public static void main(String[] args) {
		Challenge2 r = new Challenge2();
		System.out.println(r.area(6));
		System.out.println(r.area(6,8));
	}
}
