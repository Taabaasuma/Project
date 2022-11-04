package com.whilelooparray.assignment;

public class ShortArrayReverseOrderDemo2 {

	public static void main(String[] args) {

		//Declare an Short Array in Reverse Order
		Short arr[]= {10,20,30,40,50};
		//Read Elements into an Short Array
		int i=arr.length-1;
		while(i>=0)
		{
			System.out.println(arr[i]);
			i--;
		}

	}

}
