package com.sgtesting.returnmethod;
class Multiplication1
{
	int[] multiplication1(int a[],int b[])
	{
		int c[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
				c[i]=a[i]*b[i];
		}
		return c;
	}
}
public class MultiplicationOneDarrayreturn {

	public static void main(String[] args) {
		Multiplication1 o=new Multiplication1();
		int a[]= {1,2,3,4,5};
		int b[]= {2,2,2,2,2};
		int c[]=o.multiplication1(a,b);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		

	}

}
