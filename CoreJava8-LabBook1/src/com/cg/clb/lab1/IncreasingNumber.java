package com.cg.clb.lab1;

import java.util.Scanner;

public class IncreasingNumber {
	public static void checkNumber(int number){
		int m,p;
		while(number>0) {
			m=number%10;
			number=number/10;
			p=number%10;
			if(p>m) {
				System.out.println(  "not in an increasing order");
				break;
			}else {
				System.out.println( "in an increasing order");
			}
			break;
				  
		}
	}
	
	public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter the value of number:");
			int number= scan.nextInt();
			checkNumber(number);
			scan.close();
    }

	
}
