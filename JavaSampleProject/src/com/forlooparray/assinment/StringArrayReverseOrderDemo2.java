package com.forlooparray.assinment;

public class StringArrayReverseOrderDemo2 {

	public static void main(String[] args) {

		//Declare an String Array
		String str[]=new String[5];
		//Assign Elements into an String Array
		str[0]="25";
		str[1]="35";
		str[2]="45";
		str[3]="55";
		str[4]="65";
		//Read Elements into an String Array
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.println(str[i]);
		}

	}

}
