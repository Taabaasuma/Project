package com.sgtesting.inheritencePractice;
class Student
{
	String bookname;
	void show()
	{
		System.out.println("Book Name in Student:"+bookname);
	}
}
class Library extends Student
{
	String bookname;
	Library(String book1,String book2)
	{
		super.bookname=book1;
		this.bookname=book2;
	}
	void show1()
	{
		System.out.println("Book Name is Library:"+bookname);
	}
}
public class SameVariablesNameSimpleInhertence {

	public static void main(String[] args) {
		Library o=new Library("Core Java","PHP");
		o.show();
		o.show1();
		
		

	}

}
