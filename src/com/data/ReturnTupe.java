package com.data;

public class ReturnTupe {
	public void marks() {
	 int b=100;
	 int c=125;
	 int d=b+c;
	  System.out.println(d);
	 
	}
	
	public long m2() {
		long i=10148749742828l;
		long j=201998125525528l;
		long h=i-j;
		return h;
	}
	
	public float name() {
		float f=12.358f;
		return f;
		
	}
	public boolean m3() {
		boolean b=true;
		return b;
		
	}
	public char m4() {
		char c='@';
		return c;
	}
	public static void main(String[] args) {
		ReturnTupe d =new ReturnTupe();
		d.marks();
		long k=d.m2();
		System.out.println(k+100);
		float f=d.name();
		System.out.println(f);
		boolean b=d.m3();
		System.out.println(b);
		char c=d.m4();
		System.out.println(c);
		
	}

}
