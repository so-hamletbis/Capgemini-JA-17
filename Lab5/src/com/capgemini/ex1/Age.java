package com.capgemini.ex1;

public class Age {
	private int age;
	public Age(int age) throws AgeException
	{
		if(age > 15)
		{
			this.age = age;
			System.out.println("Age is: "+ this.age);
		}
		else
		{
			throw new AgeException();
		}
	}
	
	public void setAge(int age) throws AgeException
	{
		if(age > 15)
		{
			this.age = age;
			System.out.println("Age is: "+ this.age);
		}
		else
		{
			throw new AgeException();
		}
	}
	
	public int age()
	{
		return this.age;
	}

}
