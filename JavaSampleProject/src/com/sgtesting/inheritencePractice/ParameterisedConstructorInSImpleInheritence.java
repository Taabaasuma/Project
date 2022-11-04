package com.sgtesting.inheritencePractice;
class Employee
{
	Employee(String firstname,String jobname)
	{
		System.out.println("First Name:"+firstname);
		System.out.println("Job Name:"+jobname);
	}
}
class Department extends Employee
{
	Department(String f,String j)
	{
		super(f,j);
	}
}
public class ParameterisedConstructorInSImpleInheritence {

	public static void main(String[] args) {
		Department d=new Department("Santhosh","Manager");
		Department d1=new Department("Vanit","Analyst");

	}

}
