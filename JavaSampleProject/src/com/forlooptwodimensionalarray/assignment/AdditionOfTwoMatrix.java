package com.forlooptwodimensionalarray.assignment;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
		//Declare the Integer Array
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{3,2,1},{6,5,4}};
		//create anothe matrix to store the sum of two matrix
		int c[][]=new int[2][3];
		//Read the Elements in addition of two matrix
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}


	}

}
