package com.basicPattern;

import java.util.Scanner;

public class RectanglePattern {
	public static void main(String args[]) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length: ");
		num=sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
