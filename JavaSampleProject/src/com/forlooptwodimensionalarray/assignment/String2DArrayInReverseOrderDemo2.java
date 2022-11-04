package com.forlooptwodimensionalarray.assignment;

public class String2DArrayInReverseOrderDemo2 {

	public static void main(String[] args) {

		//String Datatype In Reverse Order
		//Declare the String Array
		String str[][]= {{"Mango","Apple","Banana"},{"Grapes","Mango","Orange"},{"Orange","Apple","Banana"}};
		//Read the Elements in to a 2D array
		for(int i=str.length-1;i>=0;i--)
		{
			for(int j=str[i].length-1;j>=0;j--)
			{
				System.out.print(str[i][j]+" ");
			}
			System.out.println();
		}

	}

}
