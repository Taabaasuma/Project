package com.sgtesting.recursion;
class ReverseOrder
{
	int[] reverse(int a[])
	{
		for(int i=a.length-1;i>0;i--)
		{
			System.out.println(a[i]+" ");
		}
		return a;
		
	}
}
public class Reverse {

	public static void main(String[] args) {
		ReverseOrder obj=new ReverseOrder();
		int a[]= {1,2,3,4,5,6,7,8,9};
		obj.reverse(a);

	}

}
