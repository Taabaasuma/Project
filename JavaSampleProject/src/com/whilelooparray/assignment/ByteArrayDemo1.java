package com.whilelooparray.assignment;

public class ByteArrayDemo1 {

	public static void main(String[] args) {
		
		//Declare an Byte Array
		byte arr[]=new byte[5];
		//Assign Elements into an byte Array
		arr[0]=100;
		arr[1]=50;
		arr[2]=30;
		arr[3]=20;
		arr[4]=10;
		//Read Elements from an array
		int i=0;
		while(i<arr.length)
		{
			System.out.println(arr[i]);
			i++;
		}

	}

}
