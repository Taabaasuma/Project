package com.forlooptwodimensionalarray.assignment;

public class Long2DArrayDemo1 {

	public static void main(String[] args) {

		//Long DataType
		//Declare the Integer 2D array
		long arr[][]=new long[2][3];
		//Assign the Elements into the 2D array
		arr[0][0]=10L;
		arr[0][1]=20L;
		arr[0][2]=30L;
		arr[1][0]=40L;
		arr[1][1]=50L;
		arr[1][2]=60L;
		//Read the Elements in 2D array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
