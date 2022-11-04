package com.whilelooparray.assignment;

public class DoubleArrayReverseOrderDemo2 {

	public static void main(String[] args) {

		//Declare an Double Array in Reverse Order
		double d[]= {1.2,1.3,1.4,1,2};
		//Read ELements into an Double Array
		int i=d.length-1;
		while(i>=0)
		{
			System.out.println(d[i]);
			i--;
		}

	}

}
