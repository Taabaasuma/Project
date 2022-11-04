package com.sgtesting.abstractclassassignment;
/*
   1)If an abstract class contains parameterised constructor write a programe
     to execute the parameterised constructor.
 */
abstract class Employee
{
	Employee(String ename)
	{
		System.out.println("Employee Name:"+ename);
	}
}
class Department extends Employee
{
	Department(String name)
	{
		super(name);
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		Department o=new Department("Arun");

	}

}
