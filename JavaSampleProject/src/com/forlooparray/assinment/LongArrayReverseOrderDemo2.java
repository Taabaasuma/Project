package com.forlooparray.assinment;

public class LongArrayReverseOrderDemo2 {

	public static void main(String[] args) {

		//Declare an Long  Array in Reverse order
		long arr[]=new long[5];
		//Assign Elements into an Long Array
		arr[0]=25L;
		arr[1]=35L;
		arr[2]=45L;
		arr[3]=55L;
		arr[4]=65L;
		//Read Elements from Long Array
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}

	}

}
