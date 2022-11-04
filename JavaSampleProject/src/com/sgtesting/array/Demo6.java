package com.sgtesting.array;
/*
 * Java Program to find Third Largest Number in an Array
 */
public class Demo6 {

	public static void main(String[] args) {
		int arr[]= {25,17,60,50,90,1,5};
		int max=0;
		int min=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			max=arr[i];
			if(arr[i]<min)
			min=arr[i];
		}
		 System.out.println("Largest element present in given array: " + max); 
		 System.out.println("Smalest element present in given array: " + min);  
		

	}

}
