package com.sgtesting.abstractclassassignment;
abstract class Employeeg
{
	abstract void dispaly();
	static String name;
	void displayname()
	{
		System.out.println("Employee Name:"+name);
	}
}
abstract class Departmentg extends Employeeg
{
	static String name;
	void show(String d1,String d2)
	{
		name=d1;
		super.name=d2;
		System.out.println("Departmentg Name:"+name);
	}
}
class Sportsg extends Departmentg
{
	static String name;
	void assigne(String n1,String n2,String n3)
	{
		super.show(n2, n3);
		name=n1;
		System.out.println(" Sportsg Name:"+name);
	}
	void dispaly()
	{
	System.out.println("It is abstract method");
		
	}
}
public class Assignment8 {

	public static void main(String[] args) {
		Sportsg s=new Sportsg();
		s.assigne("Cricket","Managaer","Santhosh");
		s.displayname();
		s.dispaly();

	}

}
