package com.forlooparray.assinment;

public class DivisibleNumbersBy4InReverseOrder {
	/*
     3) Programatically assign the numbers 100 to 150 which are divisible by 4 int a Single Dimentional array,
        Read the Elements  in Reverse Order.
           Step 1:We will make sure,whether we can display Numbers between 100 to 150.
           Step 2:Among 100 to 150 Numbers try to get Divisible numbers.
           Step 3:Find out size of the array to store Dvisible Number between 100 to 150.
           Step 4:Declare the integer array.
           Step 5:Assign the Divisible array between 100 to 150 in curren array.
           Step 6:Read the Elements in Reverse Order.
	 */
	public static void main(String[] args) {
		//Find out size of the array
		int count=0;
		for(int i=100;i<=150;i++)
		{
			if(i%4==0)
			{
				count++;
			}
		}
		System.out.println("# of Elements:"+count);
		//Declare the integer array
		int arr[]=new int[count];
		//Assign the Divisible Numbers in to an Array
		int k=0;
		for(int p=100;p<=150;p++)
		{
			if(p%4==0)
			{
				arr[k]=p;
				k=k+1;
			}
		}
		//Read Elements in Reverse Order
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
	}

}
