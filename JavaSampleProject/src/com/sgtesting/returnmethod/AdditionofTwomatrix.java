package com.sgtesting.returnmethod;
class Addition
{
	int[][] Addition1(int a[][],int b[][])
	{
		int c[][]=new int[a.length][b.length];
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[i].length;k++)
			{
				c[i][k]=(a[i][k]+b[i][k]);
			}
		}
		return c;
	}
}
public class AdditionofTwomatrix {

	public static void main(String[] args)
	{
		Addition r=new Addition();
	    int a[][]= {{1,2,3},{2,2,2},{3,3,3}};
	    int b[][]= {{1,2,3},{2,2,2},{3,3,3}};
	    int c[][]=r.Addition1(a,b);
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
