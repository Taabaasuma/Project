package com.sgtesting.abstractclassassignment;
/*
  7)In a multilevel inheritence super class and all subclass abstract class and three
    clases contains same instance variable name,write a programe to execute all three
    variables
 */
abstract class Flower
{
	String flowername;
	void show()
	{
		System.out.println("Flower Name:"+flowername);
	}
}
abstract class Colour extends Flower
{
	String flowername;
	Colour(String f1,String f2)
	{
		super.flowername=f1;
		this.flowername=f2;
		
	}
	void show1()
	{
		System.out.println("Flower Name of colour:"+flowername);
	}
}
class Colour2 extends Colour
{
	String flowername;
	Colour2(String fl1,String fl2,String fl3)
	{
		super(fl1,fl2);
		this.flowername=fl3;
	}
	void show2()
	{
		System.out.println("Flower Name of Colour2:"+flowername);
	}
}
public class Assignment7 {

	public static void main(String[] args) {
		Colour2 o=new Colour2("Rose","Red","Pink");
		o.show();
		o.show1();
		o.show2();
		

	}

}
