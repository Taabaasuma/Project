package com.sgtesting.javatest1assignment;

public class Demo7 {

	public static void main(String[] args) {
		// 2D String array and cancatenate the all string elements from array
		String arr[][]= {{"C#"},{"PYTHON"}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}

	}

}
