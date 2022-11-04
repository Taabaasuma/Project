package com.whilelooparray.assignment;

public class StringArrayReverseOrderDemo2 {

	public static void main(String[] args) {

		//Declare an String Array in Reverse Order
		String str[]= {"25","Python","C#","PHP"};
		//Read Elements into an String Array
		int  i=str.length-1;
		while(i>=0)
		{
			System.out.println(str[i]);
			i--;
		}

	}

}
