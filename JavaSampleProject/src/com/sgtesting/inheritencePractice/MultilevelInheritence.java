package com.sgtesting.inheritencePractice;
class Maths3
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
}
class Maths4 extends Maths3
{
	void substraction(int x,int y)
	{
		int res=(x-y);
		System.out.println("Substraction Result:"+res);
	}
}
class Maths5 extends Maths4
{
	void Multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("Multiplication Result:"+res);
	}
}
public class MultilevelInheritence {

	public static void main(String[] args) {
		Maths5 m=new Maths5();
		m.addition(10, 20);
		m.substraction(30, 20);
		m.Multiplication(5, 2);

	}

}
