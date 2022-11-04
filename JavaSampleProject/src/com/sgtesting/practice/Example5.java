package com.sgtesting.practice;
abstract class Vehicleu
{
	static
	{
		System.out.println("It is a Static Block!!");
	}
}
class Car extends Vehicleu
{
	Car()
	{
		
	}
}
public class Example5 {

	public static void main(String[] args) {
		Car o=new Car();

	}

}
