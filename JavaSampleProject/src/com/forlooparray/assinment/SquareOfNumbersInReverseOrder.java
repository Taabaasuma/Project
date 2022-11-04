package com.forlooparray.assinment;

public class SquareOfNumbersInReverseOrder {
	/*
	    4) Programatically assign the Square of First 10 Numbers into a SIngle Dimentional Array in Reverse Order,
	       Read the elements from the array in reverse order.
	          Step 1:We will make sure,whether we can display First 10 Numbers.
	          Step 2:Among First 10 Numbers Try to get Squar root.
	          Step 3:Find out the size of the array to store Square of first 10 Numbers.
	          Step 4:Declare the integer array.
	          Step 5:Assign the Square of first 10 numbers in to an array.
	          Step 6:Read the Elements in Reverse Order
	 */

	public static void main(String[] args) {
		//Find out the size of array
		int count=0;
		for(int i=1;i<=10;i++)
		{
			count++;
		}
		System.out.println("# of Elements:"+count);
		//Declare the integer array
		int arr[]=new int[count];
		//Assign the square numbers in to an array
		int k=0;
		for(int p=1;p<=10;p++)
		{
			arr[k]=p;
			k=k+1;
		}
		//Read the Elements in Reverse Order
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]*arr[j]);
		}

	}

}
