package com.sgtesting.returnmethod;
class Addition1
{
	int[] addition1(int a[],int b[])
	{
		int c[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
		}
		return c;
	}
}
public class AdditonOneDarrayReturn {

	public static void main(String[] args) {
		Addition1 o=new Addition1();
		int a[]= {1,2,3,4,5};
		int b[]= {1,6,5,3,2};
		int c[]=o.addition1(a, b);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}

	}

}
