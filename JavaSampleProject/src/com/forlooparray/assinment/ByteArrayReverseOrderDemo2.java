package com.forlooparray.assinment;

public class ByteArrayReverseOrderDemo2 {

	public static void main(String[] args) {
		//Declare an byte array in Reverse Order
		byte arr[]=new byte[5];
		//Assign Element into an byte array
		arr[0]=25;
		arr[1]=35;
		arr[2]=45;
		arr[3]=55;
		arr[4]=65;
		//Read Element from byte array in reverse order
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}

	}

}
