package com.sgtesting.returnmethod;
class Fibonacy
{
	int fib(int num,int num1)
	{

		int a=0;
		int b=1;
		int c=a+b;
		for(int i=num;i<num1;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		return c;
		
	}
}
public class FibonacyReturn {

	public static void main(String[] args) {
		Fibonacy o=new Fibonacy();
		int c=o.fib(1,10);
		System.out.println(c);
		int d=o.fib(1,4);
		System.out.println(d);

	}

}
