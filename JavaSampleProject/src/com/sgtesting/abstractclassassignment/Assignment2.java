package com.sgtesting.abstractclassassignment;
/*
  2)In a multilevel inheritence super class in an abstract class it has constructor
    overloading.
 */
abstract class Employee1
{
	Employee1(String ename)
	{
		System.out.println("Employee Name:"+ename);
	}
	Employee1(int emp_id)
	{
		System.out.println("Employee Id:"+emp_id);
	}
}
class Department1 extends Employee1
{
	Department1(String name)
	{
		super(name);
	}
	Department1(int eid)
	{
		super(eid);
	}
}
class Student extends Department1
{
	Student(String n)
	{
		super(n);
	}
	Student(int id)
	{
		super(id);
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		Student o=new Student("Akash");
		Student o1=new Student(120);

	}

}
