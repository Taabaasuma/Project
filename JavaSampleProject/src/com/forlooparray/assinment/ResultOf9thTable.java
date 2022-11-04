package com.forlooparray.assinment;

public class ResultOf9thTable {
	/*
    2)Programatically assign the Result of 9th Table into a Single Dimentional array & Read the Element from Array.
        Step 1:We will make sure whether we can display 9th Table.
        Step 2:Among 9th Table try to get Result.
        Step 3:FInd out the size of the array to store 9th Table.
        Step 4:Declare the integer array.
        Step 5:Assign the 9th Table into an Array
        Step 6:Read the Elements from the array.
	 */
	public static void main(String[] args) {
		//Find out the size of array
		int count=0;
		for(int i=1;i<=10;i++)
		{
			{
				count++;
			}
		}
		System.out.println("# of Elements:"+count);
		//Declare the integer array
		int arr[]=new int[count];
		//Assign 9th table into an array
		int k=0;
		for(int p=1;p<=10;p++)
		{
			arr[k]=p;
			k=k+1;
		}
		//Read the Elements of 9th Table
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(+9*j);
		}
	}

}
