package com.dowhilelooparray.assignment;

public class ByteArrayDemo1 {

	public static void main(String[] args) {

		//Declare an Byte Array
		byte arr[]=new byte[5];
		//Assign Elements into an Byte Array
		arr[0]=20;
		arr[1]=30;
		arr[2]=40;
		arr[3]=50;
		arr[4]=60;
		//Read Elements into an Byte Array
		int i=0;
		do
		{
			System.out.println(arr[i]);
			i++;
		}while(i<arr.length);


	}

}
