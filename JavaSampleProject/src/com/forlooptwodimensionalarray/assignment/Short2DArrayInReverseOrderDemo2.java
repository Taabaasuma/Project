package com.forlooptwodimensionalarray.assignment;

public class Short2DArrayInReverseOrderDemo2 {

	public static void main(String[] args) {

		//Short DataType in Reverse Order
		//Declare the Integer 2D array
		short arr[][]=new short[3][3];
		//Assign the Elements into the 2D array
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		arr[2][0]=70;
		arr[2][1]=80;
		arr[2][2]=90;
		//Read the Elements in 2D array
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=arr[i].length-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
