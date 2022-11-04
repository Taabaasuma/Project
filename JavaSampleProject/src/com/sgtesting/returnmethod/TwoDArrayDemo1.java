package com.sgtesting.returnmethod;
class TwodArray
{
	void displayElements()
	{
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	int[][] getElements()
	{
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		return a;
	}
}
public class TwoDArrayDemo1 {

	public static void main(String[] args) {
		TwodArray o=new TwodArray();
		o.displayElements();
		System.out.println("+++++++++++++++++++++");
		int b[][]=o.getElements();
		System.out.println("Read the Elements in Reverse Order");
		for(int i=b.length-1;i>=0;i--)
		{
			for(int j=b[i].length-1;j>=0;j--)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		int c[][]=o.getElements();
		System.out.println("Read the  Elements in First Row Only");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				if(i==0)
				{
					System.out.print(c[i][j]+" ");
				}
			}
			System.out.println();
		}
		System.out.println("Read the  Elements in First Column Only");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				if(j==0)
				{
					System.out.print(c[i][j]+" ");
				}
			}
			System.out.println();
		}
		System.out.println("Read the Elements in transpose");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[j][i]+" ");
			}
			System.out.println();
		}

	}

}
