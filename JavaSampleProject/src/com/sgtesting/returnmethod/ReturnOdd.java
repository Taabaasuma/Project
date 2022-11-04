package com.sgtesting.returnmethod;
class OddNumber
{
	int[] oddNumber(int num,int num1)
	{
		int count=0;
		for(int i=num;i<=num1;i++)
		{
			if(i%2==1)
			{
				count++;
			}
		}
		int b[]=new int[count];
		int k=0;
		for(int i=num;i<=num1;i++)
		{
			if(i%2==1)
			{
				b[k]=i;
				k++;
			}
		}
		return b;
	}
}
public class ReturnOdd {

	public static void main(String[] args) {
		OddNumber obj=new OddNumber();
		int b[]=obj.oddNumber(111,141);
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.println(b[i]+" ");
		}

	}

}
