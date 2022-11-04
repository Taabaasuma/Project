package com.forlooptwodimensionalarray.assignment;

public class Double2DArrayDemo1 {

	public static void main(String[] args) {

		//Double datatype
		//Declare the Decimal Array
		double d[][]= {{10.22,20.10,30.3},{40.56,50.96,60.30},{70,80,90}};
		//Read the Elements in to a 2D array
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}

	}

}
