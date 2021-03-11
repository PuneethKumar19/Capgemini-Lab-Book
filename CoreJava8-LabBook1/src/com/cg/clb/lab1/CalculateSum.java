package com.cg.clb.lab1;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int sum=0;
		System.out.println("Enter the value of n");
		int n= scan.nextInt();
		
		for(int i=n; i>0; i--) {
			if((i%3==0)||(i%5==0)) {
				sum+=i;
			}
		}
		System.out.println("Sum of first" + " " + n +" " + "natural numbers divisible by 3 or 5 :" + " " + sum);
		scan.close();

	}

}
