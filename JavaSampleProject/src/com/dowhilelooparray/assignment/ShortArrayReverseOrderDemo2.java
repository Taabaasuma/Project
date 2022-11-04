package com.dowhilelooparray.assignment;

public class ShortArrayReverseOrderDemo2 {

	public static void main(String[] args) {

		//Declare an Short Array in Reverse Order
		short arr[]= {10,20,30,40,50};
		//Read ELements into an Short Array
		int i=arr.length-1;
		do
		{
			System.out.println(arr[i]);
			i--;
		}while(i>=0);

	}

}
