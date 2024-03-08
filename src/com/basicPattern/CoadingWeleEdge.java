package com.basicPattern;

public class CoadingWeleEdge {
//	public void  show(int a) {
//		System.out.println("int "+a);
//	}
	public void show(byte a) {
		
		System.out.println("byte: "+a);
	}
	public void show(short a) {
		System.out.println("short: "+a);
	}
	public void show(long a) {
		System.out.println("long: "+a);
	}
	public void show(double a) {
		System.out.println("double: "+a);
	}
	public void show(float a) {
		System.out.println("float: "+a);
	}
	public void show(char a) {
		System.out.println("char: "+a);
	}
	public void adi() {
		int b=10;
		System.out.println(b);
	}
	public static void main(String args[]) {
		
		
		CoadingWeleEdge obj=new CoadingWeleEdge();
		int a=10;
		obj.show(a);
		obj.adi();
	}

}
