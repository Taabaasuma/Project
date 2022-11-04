package com.whilelooparray.assignment;

public class CharacterArrayReverseOrderDemo2 {

	public static void main(String[] args) {

		//Declare an Character Array in Reverse Order
		char arr[]= {'A','E','I','O','U'};
		//Read Elements into an Character Array
		int i=arr.length-1;
		while(i>=0)
		{
			System.out.println(arr[i]);
			i--;
		}

	}

}
