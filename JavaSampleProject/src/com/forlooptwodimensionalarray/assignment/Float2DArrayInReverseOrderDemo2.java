package com.forlooptwodimensionalarray.assignment;

public class Float2DArrayInReverseOrderDemo2 {

	public static void main(String[] args) {

		//Float datatype In Reverse Order
		//Declare the Decimal Array
		float f[][]= {{10,20,30},{40,50,60},{70,80,90}};
		//Read the Elements in to a 2D array
		for(int i=f.length-1;i>=0;i--)
		{
			for(int j=f[i].length-1;j>=0;j--)
			{
				System.out.print(f[i][j]+" ");
			}
			System.out.println();
		}

	}

}
