package com.sgtesting.methods;
class Calculation
{
	void substraction(int a[][],int b[][])
	{ 
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]-b[i][j]+" ");  
			}
			System.out.println();
		}
	}
}
public class SubstractionofMatrix {

	public static void main(String[] args) {
		int a[][]= {{4,4},{4,4}};
		int b[][]= {{2,2},{2,2}};
		Calculation o1=new Calculation();
		o1.substraction(a,b);
		

	}

}
