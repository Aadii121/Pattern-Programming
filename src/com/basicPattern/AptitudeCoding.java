package com.basicPattern;

public class AptitudeCoding {
	
	public static void main(String args[]) {
		
		int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i==j ) {
					System.out.print(i);
				}
				else {
					System.out.print(" ");
				}
				
			}
			
			for(int j=1;j<=num;j++) {
				if(i+j==num ) {
					System.out.print(i);
				}
				else {
					System.out.print(" ");
				}
				
			}
		   
			System.out.println();
			
			
		}
		for(int i=4;i>=1;i--) {
		for(int j=5;j>=1;j--) {
			if(i+j==num+1) {
				System.out.print(i);
			}
			else {
				System.out.print(" ");
			}
		}
		
		for(int j=5;j>=1;j--) {
			if(i==j) {
				System.out.print(j);
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	
		}
	}

}
