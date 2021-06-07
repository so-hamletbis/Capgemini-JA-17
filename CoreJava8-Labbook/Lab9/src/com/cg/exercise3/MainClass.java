package com.cg.exercise3;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sm=new Scanner(System.in);
		validationinterface i = (username,password)->{
			return (username.equals("trent") && password.equals("trent1111"));
		};
		
		System.out.print("Enter the username : ");
		String username=sm.next();
		
		System.out.print("Enter the password : ");
		String password=sm.next();
		
		System.out.println("\nAuthentication Status : "+i.validateuser_pass(username, password));
		sm.close();
	}

}
