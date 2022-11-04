package com.sgtesting.returnmethod;
class Multiplication 
{
	int[][] multiplication(int a[][],int b[][])
	{
		int c[][]=new int[a.length][b.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=0;      
				for(int k=0;k<3;k++)
				{
					c[i][j]+=(a[i][k]*b[i][k]);
				}
			}

		}
		return c;
	}
}
public class MultiplicationDemo {

	public static void main(String[] args) {
		Multiplication  o=new Multiplication();
		int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};
		int c[][]=o.multiplication(a,b);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
