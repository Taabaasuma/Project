package com.forlooptwodimensionalarray.assignment;

public class Double2DArrayInReverseOrderDemo2 {

	public static void main(String[] args) {

		//Double datatype In Reverse Order
		//Declare the Decimal Array
		double d[][]= {{10.22,20.10,30.3},{40.56,50.96,60.30},{70,80,90}};
		//Read the Elements in to a 2D array
		for(int i=d.length-1;i>=0;i--)
		{
			for(int j=d[i].length-1;j>=0;j--)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}

	}

}
