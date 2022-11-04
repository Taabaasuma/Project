package com.sgtesting.returnmethod;
class Factorial
{
	int factorial(int f,int num)
	{
		for(int i=num;i>=1;i--)
		{
			f=f*i;
		}
		return f;
	
	}
}
public class FactorialReturn {

	public static void main(String[] args) {
		Factorial o=new Factorial();
		int b=o.factorial(1,5);
		System.out.println(b);
	}

}
