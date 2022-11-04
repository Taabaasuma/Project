package com.forlooptwodimensionalarray.assignment;

public class Integer2DArrayInTranspose {

	public static void main(String[] args) {
		
		//Declare the Integer array
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		//Read the elements in Integer array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//Read the Elements In Transpose the Above Array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}

}
