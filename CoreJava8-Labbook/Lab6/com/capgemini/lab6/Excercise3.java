package com.capgemini.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Excercise3 {
	public static Map<Integer,Integer> getSquares(int[] array){
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<array.length;i++) {
			map.put(array[i], array[i]*array[i]);
		}
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size=sc.nextInt();
		if(size<1)
			System.out.println("Erroe! Size should be 1 or more");
		else {
			int array[]=new int[size];
			for(int i=0;i<size;i++) {
				System.out.print("Enter element no."+(i+1)+":");
				array[i]=sc.nextInt();
			}
			Map<Integer,Integer> map=getSquares(array);
			System.out.print("The results are given below :\n");
			for(Map.Entry<Integer, Integer> m : map.entrySet()) {
				System.out.println("Number: "+m.getKey()+" and square of "+m.getKey()+": "+m.getValue());
			}
		}
		sc.close();

	}


}
