package com.basicPattern;

import java.util.Scanner;

public class Pattern {
	public static void main(String args[]) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num=sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i==0 || j==0 || i==(num-1)/2 || j==num-1) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
