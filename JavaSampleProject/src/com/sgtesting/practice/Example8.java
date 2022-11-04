package com.sgtesting.practice;
abstract class Demo5
{
	String firstname;
	void show()
	{
		System.out.println("First Name:"+firstname);
	}
}
class Demo6 extends Demo5
{
	String firstname;
	Demo6(String fn1,String fn2)
	{
		super.firstname=fn1;
		this.firstname=fn2;
	}
	void show1()
	{
		System.out.println("First Name of Demo1:"+firstname);
	}
}
class Demo7 extends Demo6
{
	String firstname;
	Demo7(String f1,String f2,String f3)
	{
		super(f1,f2);
		this.firstname=f3;
	}
	void show2()
	{
		System.out.println("First Name of Demo2:"+firstname);
	}
}
public class Example8 {

	public static void main(String[] args) {
		Demo7 o=new Demo7("Santhosh","Arun","Kavi");
		o.show();
		o.show1();
		o.show2();

	}

}
