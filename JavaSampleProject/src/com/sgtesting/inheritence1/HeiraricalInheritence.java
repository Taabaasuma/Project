package com.sgtesting.inheritence1;
class Employee
{
	Employee(String Ename)
	{
		System.out.println("Employee Name:"+Ename);
	}
}
class Department extends Employee
{
	Department(String name)
	{
		super(name);
	}
}
class Sport1 extends Employee
{
	Sport1(String n)
	{
		super(n);
	}
}
public class HeiraricalInheritence {

	public static void main(String[] args) {
		Department o=new Department("Santhosh");
		System.out.println("---------------------");
		Sport1 s=new Sport1("Cricket");
		
		
		
		

	}

}
