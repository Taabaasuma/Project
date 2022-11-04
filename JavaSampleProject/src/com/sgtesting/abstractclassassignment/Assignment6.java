package com.sgtesting.abstractclassassignment;
/*
  6)Their are two abstract class each class contains two abstract method,write a programe
    execute all available abstract method.
 */
abstract class Student2
{
	abstract void displayStudentName(String sname);
	abstract void displayStudentId(int s_id);
}
abstract class Library2 extends Student2
{
	abstract void dispalyBookName(String bname);
	abstract void displayBookNumber(int bno);
}
class Student3 extends Library2
{
	void displayStudentName(String sname)
	{
		System.out.println("Student Name:"+sname);
	}
	void displayStudentId(int s_id)
	{
		System.out.println("Student Id:"+s_id);
	}
	void dispalyBookName(String bname)
	{
		System.out.println("Book Name:"+bname);
	}
	void displayBookNumber(int bno)
	{
		System.out.println("Book Number:"+bno);
	}
}
public class Assignment6 {

	public static void main(String[] args) {
		Student3 o=new Student3();
		o.displayStudentName("Santhosh");
		o.displayStudentId(111);
		o.dispalyBookName("Core Java");
		o.displayBookNumber(20);

	}

}
