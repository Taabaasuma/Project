package com.forlooparray.assinment;

public class OddNumberInReverseOrder {
	/*
	   1)Programatically assign Odd Number 71 to 41 in a Single Dimentional Array & Read the Elements 
	     from the array in Reverse Order.
	      Step 1:We will make sure.whether we can display Numbers Between 71 to 41.
	      Step 2:Among 71 to 41 Numbers try to get Odd Numbers.
	      Step 3:Find out the size of Array to Store Odd Numbers between 71 to 41.
	      Step 4:Declare the Integer Array.
	      Step 5:Read the Elements in Reverse Order.
	 */
	public static void main(String[] args) {

		//Find out size of the array
		int count=0;
		for(int i=71;i>=41;i--)
		{
			if(i%2==1)
			{
				count++;
			}
		}
		System.out.println("# of ELements:"+count);
		//Declare the Integer Array
		int odd[]=new int[count];
		//Assign Odd Numbers in to an Array
		int k=0;
		for(int p=71;p>=41;p--)
		{
			if(p%2==1)
			{
				odd[k]=p;
				k=k+1;

			}
		}
		//Read elements in Reverse Order
		for(int j=odd.length-1;j>=0;j--)
		{
			System.out.println(odd[j]);
		}


	}

}
