package com.forlooptwodimensionalarray.assignment;

public class Byte2DArrayDemo1 {
	/*
         1)Integer Datatype
	 */
	public static void main(String[] args) {

		//Byte DataType
		//Declare the Integer 2D array
		byte arr[][]=new byte[2][3];
		//Assign the Elements into the 2D array
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
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
