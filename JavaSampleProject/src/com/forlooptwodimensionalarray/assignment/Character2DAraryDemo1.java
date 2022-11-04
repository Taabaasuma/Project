package com.forlooptwodimensionalarray.assignment;

public class Character2DAraryDemo1 {

	public static void main(String[] args) {

		//Char Datatype
		//Declare the Character Array
		char ch[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		//Read the Elements in to a 2D array
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length;j++)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}

	}

}
