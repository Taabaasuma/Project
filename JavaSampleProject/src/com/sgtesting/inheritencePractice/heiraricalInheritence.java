package com.sgtesting.inheritencePractice;
class Maths6
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
}
class Maths7 extends Maths6
{
	void substraction(int x,int y)
	{
		int res=(x-y);
		System.out.println("Substraction Result:"+res);
	}
}
class Maths8 extends Maths6
{
	void division(int x,int y)
	{
		int res=(x/y);
		System.out.println("Division Result:"+res);
	}
}
public class heiraricalInheritence {

	public static void main(String[] args) {
		Maths7 m=new Maths7();
		m.addition(10, 20);
		m.substraction(30, 20);
		
		Maths8 m1=new Maths8();
		m1.addition(20, 20);
		m1.division(10, 5);

	}

}
