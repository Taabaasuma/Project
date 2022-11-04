package com.sgtesting.practiceprograms;

public class EvenNumbersInReverseOrder {
	/*
	     1) Programatically assign Even numbers 20 to 40 into single dimensional array &
	         Read the elements from single dimensional array in Reverse Order.
	            Step 1:We will make sure,whether we can display Numbers between 20 to 40.
	            Step 2:Among 20 to 40 numbers try to get even numbers.
	            Step 3:Find out the size of the array to store even numbers between 20 to 40.
	            Step 4: Declare the integer array.
	            Step 5:Assign even numbers 20 to 40 in current array.
	            Step6:Read the elements in reverse order.
	 */

	public static void main(String[] args) {
		//find out the size of array
		int count=0;
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		System.out.println("# of ELements:"+count);
		//Declare the integer array
		int even[]=new int[count];
		//Assign the elements into an even numbers
		int k=0;
		for(int p=20;p<=40;p++)
		{
			if(p%2==0)
			{
				even[k]=p;
				k=k+1;
			}
		}
		//Read the Elements in Reverse Order
		for(int j=even.length-1;j>=0;j--)
		{
			System.out.println(even[j]);
		}

	}

}
