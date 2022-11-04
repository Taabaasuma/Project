package com.sgtesting.stati;
/*class Maths2
{
	void addition(int x,int y)
	{
		substraction(20,10);
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
	static void substraction(int x,int y)
	{
		int res=(x-y);
		System.out.println("Substraction Result:"+res);
	}
}*/
class Maths2
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
	static void substraction(int x,int y)
	{
		Maths2 o=new Maths2();
		o.addition(10,20);
		int res=(x-y);
		System.out.println("Substraction Result:"+res);
	}
}
public class StaticandInstanceMethod {

	public static void main(String[] args) {
		/*Maths2 o=new Maths2();
		o.addition(30, 20);*/
		Maths2.substraction(50,20);

	}

}
