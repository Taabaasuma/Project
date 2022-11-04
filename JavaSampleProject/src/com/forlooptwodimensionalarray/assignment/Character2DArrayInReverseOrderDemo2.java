package com.forlooptwodimensionalarray.assignment;

public class Character2DArrayInReverseOrderDemo2 {

	public static void main(String[] args) {

		//Char Datatype In Reverse Order
		//Declare the Character Array
		char ch[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		//Read the Elements in to a 2D array
		for(int i=ch.length-1;i>=0;i--)
		{
			for(int j=ch[i].length-1;j>=0;j--)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}


	}

}
