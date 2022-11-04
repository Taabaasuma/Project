package com.sgtesting.inheritence1;
class Student
{
	void s(String Sname)
	{
		System.out.println("Student name:"+Sname);
	}
}
class Library extends Student
{
	void l(String Lname)
	{
		System.out.println("Library Name:"+Lname);
	}
}
class Sports extends Library
{
	void sP(String Spname)
	{
		System.out.println("Sports name:"+Spname);
	}
}
public class MultilevelInheritence {

	public static void main(String[] args) {
		Sports o=new Sports();
		o.s("Santhosh");
		o.l("City Central");
		o.sP("Cricket");
		
	}

}
