package com.sgtesting.practice;
class Demok
{
	static void show()
	{
		Demok o=new Demok();
		System.out.println("It is a Static method");
	}
	static
	{
		System.out.println("It is a static block");
	}
}
public class Example12 {

	public static void main(String[] args) {
		Demok.show();

	}

}
