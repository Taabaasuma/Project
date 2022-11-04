package com.dowhilelooparray.assignment;

public class DoubleArrayReverseOrderDemo2 {

	public static void main(String[] args) {

		//Declare an Double array in Reverse Order
		double d[]= {2.2,3.3,3.45,6,7};
		//Read Elements into an Double Order
		int i=d.length-1;
		do
		{
			System.out.println(d[i]);
			i--;
		}while(i>=0);


	}

}
