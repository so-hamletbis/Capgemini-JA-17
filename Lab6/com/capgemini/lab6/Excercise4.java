package com.capgemini.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Excercise4 {
	public static HashMap<Integer,String> getStudents(HashMap<Integer,Integer> h){
		HashMap<Integer,String> map = new HashMap<>();
		for(Map.Entry<Integer,Integer> m : h.entrySet()) {
			if(m.getValue()>=90)
			{
				map.put(m.getKey(),"Gold");
			}
			else if(m.getValue()>=80 && m.getValue()<90)
			{
				map.put(m.getKey(),"Silver");
			}
			else if(m.getValue()>=70 && m.getValue()<80)
			{
				map.put(m.getKey(),"Bronze");
			}
		}
		
		return map;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the strength of the class: ");
		int size=sc.nextInt();
		if(size<1)
			System.out.println("Error! Number of students must be more than 0");
		else {
			HashMap<Integer,Integer> hm=new HashMap<>();
			for(int i=0;i<size;i++) {
				System.out.print("Enter the registration no. of Student "+(i+1)+" : ");
				int regNo=sc.nextInt();
				System.out.print("Enter the marks of Student "+(i+1)+" : ");
				int marks=sc.nextInt();
				hm.put(regNo,marks);
			}
			HashMap<Integer,String> map=getStudents(hm);
			System.out.print("The medal results are given below:\n");
			for(HashMap.Entry<Integer,String> hp : map.entrySet()) {
				System.out.println("Registration Number: "+hp.getKey()+", Medal: "+hp.getValue());
			}
		}
		sc.close();
	}

}
