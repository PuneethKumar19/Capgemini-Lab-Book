package com.cg.clb.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise6_5 {
	public int getSecondSmallest(int[] arr){
        List<Integer> List = new ArrayList<Integer>();
        for(int i: arr){
               List.add(i);
        }
        Collections.sort(List);
        return List.get(1);
 }
 public static void main(String[] args) {
        Exercise6_5 p = new Exercise6_5();
        int arr[] = {43,54,65,76,32,76,87,43,66,7,32,54,43};
        int i = p.getSecondSmallest(arr);
        System.out.println(i);
 }
}
