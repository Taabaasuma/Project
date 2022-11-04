package com.sgtesting.recursion;
class SumDigite
{
	int Digite(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
}
public class Demosum1 {

	public static void main(String[] args) {
		SumDigite obj=new SumDigite();
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=obj.Digite(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(sum);
		}


	}

}
