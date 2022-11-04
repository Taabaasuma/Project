package com.forlooptwodimensionalarray.assignment;

public class CharacterArray3X3 {

	public static void main(String[] args) {

		//Declare the 3x3 Character Array
		char ch[][]= {{'X','Y','Z'},{'A','B','C'},{'P','Q','R'}};
		//Assign the 3X3 Character Array
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length;j++)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
		//Read the elements from first row alone
		for(int i=0;i<1;i++)
		{
			System.out.println(ch[i]);
		}
		//Read the Elements from Last row
		for(int i=ch.length-1;i>=0;i--)
		{
			for(int j=ch[i].length-1;j>=0;j--)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
		//Read the Elements from first column
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<=0;j++)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
		//Read the Elements from last column
		for(int i=0;i<ch.length;i++)
		{
			for(int j=ch[i].length-1;j>=0;j--)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
