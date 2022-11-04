package com.sgtesting.returnmethod;
class Resultant
{
	int[] resultant(int a[],int b[])
	{
		int y=0;
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[y]=a[i];
			y++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[y]=b[i];
			y++;
		}
		return c;
	}
}
public class ReturnResultant {

	public static void main(String[] args) {
		Resultant o=new Resultant();
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8,9};
		int c[]=o.resultant(a,b);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}

	}

}
