package com.sgtesting.practice;
abstract class Employeea
{
	abstract void displayEmployeeName(String name);
}
class Departmenta extends Employeea
{
	void displayEmployeeName(String name)
	{
		System.out.println("Employee Name:"+name);
	}
}
class Operationa extends Employeea
{
	void displayEmployeeName(String name)
	{
		System.out.println("Operation Name:"+name);
	}
	void displayOperationaName(String name)
	{
		System.out.println("Operation Name:"+name);
	}
}
class Sportsa extends Operationa
{
	void displayEmployeeName(String name)
	{
		System.out.println("Sports Name:"+name);
	}
}
public class Example6 {

	public static void main(String[] args) {
		Departmenta d=new Departmenta();
		d.displayEmployeeName("Santhosh");
		System.out.println("------------------------");
		Sportsa s=new Sportsa();
		s.displayEmployeeName("Manager");
		s.displayOperationaName("LIC");
	}

}
