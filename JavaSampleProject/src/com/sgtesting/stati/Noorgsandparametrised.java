package com.sgtesting.stati;
class Demo8
{
	Demo8(String firstname)
	{
		 Demo9 o=new  Demo9();
		System.out.println("Name:"+firstname);
	}
}
class Demo9
{
	Demo9()
	{
		System.out.println("It is a No args Constructor");
	}
}
public class Noorgsandparametrised {

	public static void main(String[] args) {
		Demo8 o=new Demo8("Santhosh");

	}

}
