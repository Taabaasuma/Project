package com.sgtesting.javatest1assignment;

public class Demo6 {

	public static void main(String[] args) {
		// First row of elements from 2D array
		int arr[][]= {{10,20,30},{40,50,60}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==0)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
		

	}

}
