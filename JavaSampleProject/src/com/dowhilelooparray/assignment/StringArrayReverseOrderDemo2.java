package com.dowhilelooparray.assignment;

public class StringArrayReverseOrderDemo2 {

	public static void main(String[] args) {

		//Declare an String Array in Reverse Order
		String str[]= {"25","65","85","95"};
		//Read Elements into an String Array
		int i=str.length-1;
		do
		{
			System.out.println(str[i]);
			i--;
		}while(i>=0);

	}

}
