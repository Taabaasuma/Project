package com.sgtesting.methods;
class Fact
{
	int  factorial(int f,int num)
	{
		for(int i=num;i>=1;i--)
		{
			f=f*i;
		}
		return f;
	}

}
public class FactorialNumber {

	public static void main(String[] args) {
		Fact o=new Fact();
		int c=o.factorial(1,5);
		System.out.println(c);

	}

}
