package com.sgtesting.returnmethod;
class Substraction
{
	int[][] substraction(int a[][],int b[][])
	{
		int c[][]=new int[a.length][b.length];
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[i].length;k++)
			{
				c[i][k]=(a[i][k]-b[i][k]);
			}
		}
		return c;
	}
}
public class SubstractionofTwoMatrix {

	public static void main(String[] args) {
		Substraction r=new Substraction();
	    int a[][]= {{5,4,6},{2,3,6},{3,4,9}};
	    int b[][]= {{1,2,3},{6,8,7},{9,8,7}};
	    int c[][]=r.substraction(a,b);
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
