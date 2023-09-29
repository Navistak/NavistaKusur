package com.cjc.karve;

public class A {
	static int x;
	int y;
	
	public static void main(String args[])
	{
		A a=new A();
		A.x=100;
		a.y=100;
	
		A a1=new A();
		A.x=200;
		a1.y=200;
		System.out.println(A.x);
		System.out.println(a.y);
		System.out.println(A.x);
		System.out.println(a1.y);
			
		}
}