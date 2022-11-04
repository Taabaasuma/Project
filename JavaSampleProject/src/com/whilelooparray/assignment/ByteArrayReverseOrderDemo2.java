package com.whilelooparray.assignment;

public class ByteArrayReverseOrderDemo2 {

	public static void main(String[] args) {

		//Declare an Byte Array in Reverse Order
		byte arr[]=new byte[5];
		//Assign Elements into an byte Array
		arr[0]=100;
		arr[1]=50;
		arr[2]=30;
		arr[3]=20;
		arr[4]=10;
		//Read Elements from an array
		int i=arr.length-1;
		while(i>=0)
		{
			System.out.println(arr[i]);
			i--;
		}

	}

}
