package com.practice.test;
class Break1
{
	void forLoopBreaklable(int num1,int num2)
	{
		for(int i=1;i<=num1;i++)
		{
			for(int j=1;j<=num2;j++)
			{
				if(i+j==8)
				{
					break;
				}
				System.out.println(i+j);
			}
		}
	}
}
public class ForLoopBreakLableExample {

	public static void main(String[] args) {
		Break1 o=new Break1();
		o.forLoopBreaklable(10,5);

	}

}
