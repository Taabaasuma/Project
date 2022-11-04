package com.sgtesting.practice;
abstract class Student
{
	Student(String name)
	{
		System.out.println("Student Name:"+name);
	}
	Student(int id)
	{
		System.out.println("Student Id:"+id);
	}
}
class Libraryx extends Student
{
	Libraryx(String n)
	{
		super(n);
	}
	Libraryx(int i)
	{
		super(i);
	}
}
class College extends Libraryx
{
	College(String N)
	{
		super(N);
	}
	College(int I)
	{
		super(I);
	}
}
public class Example3 {

	public static void main(String[] args) {
		College o=new College("Santhosh");
		College o1=new College(120);

	}

}
