package com.capgemini.ex1;

public class AgeException extends Exception{
	
	public AgeException() {
		System.out.println("Exceotion: Age of a person should be above 15");
	}

}
