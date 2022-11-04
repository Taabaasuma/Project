package com.sgtesting.inheritencePractice;
class Maths
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
}
class Maths1 extends Maths
{
	void substraction(int x,int y)
	{
		int res=(x-y);
		System.out.println("Substraction Result:"+res);
	}
}
public class SimpleInheritence {

	public static void main(String[] args) {
		Maths1 m=new Maths1();
		m.substraction(30,20);
		m.addition(20, 30);

	}

}
