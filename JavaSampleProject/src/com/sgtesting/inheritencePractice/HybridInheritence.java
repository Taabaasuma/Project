package com.sgtesting.inheritencePractice;
class Maths9
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
}
class Maths10 extends Maths9
{
	void substraction(int x,int y)
	{
		int res=(x-y);
		System.out.println("Substraction Result:"+res);
	}
}
class Maths11 extends Maths9
{
	void division(int x,int y)
	{
		int res=(x/y);
		System.out.println("Division Result:"+res);
	}
}
class Maths12 extends Maths11
{
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("Multiplication Result:"+res);
	}
}
public class HybridInheritence {

	public static void main(String[] args) {
		Maths10 m=new Maths10();
		m.addition(10, 20);
		m.substraction(20, 10);
		
		Maths12  m1=new Maths12();
		m1.addition(20, 20);
		m1.multiplication(10, 5);
		m1.division(10, 5);
		

	}

}
