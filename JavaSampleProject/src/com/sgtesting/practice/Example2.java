package com.sgtesting.practice;
abstract class Vehicle
{
	Vehicle(String name)
	{
		System.out.println("Vehicle Name:"+name);
	}
}
class Vehicle1 extends Vehicle
{
	Vehicle1(String name)
	{
		super(name);
	}
}
public class Example2 {

	public static void main(String[] args) {
		Vehicle1 o=new Vehicle1("Car");

	}

}
