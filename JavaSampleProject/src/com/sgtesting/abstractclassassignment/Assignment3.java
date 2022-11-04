package com.sgtesting.abstractclassassignment;
/*
  3)Their is an abstract class,abstract class contains static method,write a program
     to execute the static method.
 */
abstract class Student1
{
	static void s(String sname)
	{
		System.out.println("Student Name:"+sname);
	}
}
public class Assignment3 {

	public static void main(String[] args) {
		Student1.s("Varun");

	}

}
