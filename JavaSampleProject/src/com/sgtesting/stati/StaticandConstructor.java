package com.sgtesting.stati;
class Demo
{
	Demo()
	{
		Demo1 o=new Demo1();
		System.out.println("It is a Constructor");
	}
}
class Demo1
{
	static
	{
		System.out.println("It is a Static block");
	}
}
public class StaticandConstructor {

	public static void main(String[] args) {
		Demo o=new Demo();

	}

}
