package com.forlooptwodimensionalarray.assignment;

public class Float2DArrayDemo1 {
	/*
    2)Decimal Datatype
	 */
	public static void main(String[] args) {

		//Float datatype
		//Declare the Decimal Array
		float f[][]= {{10,20,30},{40,50,60},{70,80,90}};
		//Read the Elements in to a 2D array
		for(int i=0;i<f.length;i++)
		{
			for(int j=0;j<f[i].length;j++)
			{
				System.out.print(f[i][j]+" ");
			}
			System.out.println();
		}
	}

}
