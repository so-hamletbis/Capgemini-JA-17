package com.capgemini.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Excercie7 {
	public static int reverse(int number) {
		String string=""+number;
		String rev="";
		for(int i=string.length()-1;i>=0;i--) {
			rev+=string.charAt(i);
		}
		return Integer.parseInt(rev);
	}
	
	// method to reverse each elements of an array and sort and return the array
	public static int[] getSorted(int[] arr) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			arr[i]=reverse(arr[i]);
			arrList.add(arr[i]);
		}
		Collections.sort(arrList);
		for(int i=0;i<arr.length;i++) {
			arr[i]=arrList.get(i);
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the arr : ");
		int size=sc.nextInt();
		if(size<1)
			System.out.println("Error! Input must be more than 0");
		else {
			int arr[]=new int[size];
			for(int i=0;i<size;i++) {
				System.out.print("Enter Element No."+(i+1)+" : ");
				arr[i]=sc.nextInt();
			}
			System.out.println("The reversed elements before sorting the arr: ");
			for(int i=0;i<size;i++) {
				System.out.print(reverse(arr[i])+" ");
			}
			System.out.println();
			System.out.println("The reversed elements after sorting the arr: ");
			arr=getSorted(arr);
			for(int i=0;i<size;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		
		sc.close();
	}

}
