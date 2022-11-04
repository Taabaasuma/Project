package com.dowhilelooparray.assignment;

public class CharacterArrayReverseOrderDemo2 {

	public static void main(String[] args) {

		//Declare an Character Array in Reverse Order
		char arr[]= {'A','R','R','A','Y'};
		//Read ELements into an Character Array
		int i=arr.length-1;
		do
		{
			System.out.println(arr[i]);
			i--;
		}while(i>=0);


	}

}
