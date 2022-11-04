package com.forlooptwodimensionalarray.assignment;

public class String2DArrayDemo1 {

	public static void main(String[] args) {

		//String Datatype
		//Declare the String Array
		String str[][]= {{"Mango","Apple","Banana"},{"Grapes","Mango","Orange"},{"Orange","Apple","Banana"}};
		//Read the Elements in to a 2D array
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++)
			{
				System.out.print(str[i][j]+" ");
			}
			System.out.println();
		}


	}

}
