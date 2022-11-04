package com.practice.test;
class Break
{
	void forLoopBreak(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(i==6)
			{
				break;
			}
			System.out.println(i);
		}
	}
}
public class ForLoopBreakExample {

	public static void main(String[] args) {
		Break o=new Break();
		o.forLoopBreak(10);

	}

}
