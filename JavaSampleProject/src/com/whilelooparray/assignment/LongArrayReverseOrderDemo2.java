package com.whilelooparray.assignment;

public class LongArrayReverseOrderDemo2 {

	public static void main(String[] args) {

		//Declare an Long Array in Reverse Order
		long arr[]= {20L,50L,60L,70L,80L};
		//Read Elements from an Array
		int i=arr.length-1;
		while(i>=0)
		{
			System.out.println(arr[i]);
			i--;
		}

	}

}
