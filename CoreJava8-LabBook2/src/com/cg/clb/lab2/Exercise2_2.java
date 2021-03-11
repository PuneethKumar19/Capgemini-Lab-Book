package com.cg.clb.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2_2 {
public static String[] sortStrings(String arr[]) {
		
		Arrays.sort(arr);
		return arr;
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
        for (int i=0;i<arr.length;i++) {
        	arr[i]=sc.next();
        }
        String a[]=sortStrings(arr);
        for(int i=0;i<a.length;i++) {
        	System.out.println(a[i]+" ");
        }
        sc.close();
      
	}

}




