package com.dowhilelooparray.assignment;

public class LongArrayReverseOrderDemo2 {

	public static void main(String[] args) {
		
		//Declare an Long Array in Reverse Order
				Long arr[]= {10L,20L,30L,40L,50L};
				//Read ELements into an Long Array
				int i=arr.length-1;
				do
				{
					System.out.println(arr[i]);
					i--;
				}while(i>=0);

	}

}
