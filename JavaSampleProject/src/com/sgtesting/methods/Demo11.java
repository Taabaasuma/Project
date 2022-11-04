package com.sgtesting.methods;
class Factorial
{
	void factorial(int num)
	{
		int fact=1;
		if(num==0||num==1)
		{
			System.out.println(" Factorial of " +num+ " is " +1);
		}
		if(num>0)
		{
			for(int i=2;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println(" Factorial of " +num+ " is " +fact);
		}
		else
		{
			System.out.println("number should be non negative");
		}
	}
}
public class Demo11 {

	public static void main(String[] args) {
		Factorial o=new Factorial();
		o.factorial(5);
		o.factorial(3);

	}

}
