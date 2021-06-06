package com.capgemini.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			Age a = new Age(age);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			sc.close();
		}

	}

}
