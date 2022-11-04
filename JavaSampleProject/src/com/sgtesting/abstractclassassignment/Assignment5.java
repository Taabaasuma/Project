package com.sgtesting.abstractclassassignment;
/*
   5)In a Hybrid inheritence super class as an abstract class and it has come abstract
     method,write a programe to execute all the members of the super class based on 
     the subclass object.
 */
abstract class Employee2
{
	abstract void displayEmployeename(String name);
}
class Department2 extends Employee2
{
	void displayEmployeename(String name)
	{
		System.out.println("Employee Name:"+name);
	}
	void dispalyDepartmentName(String name)
	{
		System.out.println("Department Name:"+name);
	}
}
class Department3 extends Employee2
{
	void displayEmployeename(String name)
	{
		System.out.println("Employee Name:"+name);
	}
	void dispalyDepartmentName2(String name)
	{
		System.out.println("Department Name:"+name);
	}
}
class Department4 extends Department3
{
	void displayEmployeename(String name)
	{
		System.out.println("Employee Name:"+name);
	}
	void dispalyDepartmentName3(String name)
	{
		System.out.println("Department Name:"+name);
	}
}
public class Assignment5 {

	public static void main(String[] args) {
		 Department2 o=new  Department2();
		 o.dispalyDepartmentName("Manager");
		 o.displayEmployeename("Santhosh");
		 System.out.println("----------------------------");
		 Department4 d=new Department4();
		 d.displayEmployeename("Arun");
		 d.dispalyDepartmentName2("Analyst");
		 o.displayEmployeename("Akash");
		 d.dispalyDepartmentName3("CEO");

	}

}
