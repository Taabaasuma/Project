package com.sgtesting.array;
/*
 * Program to print the largest element in an array
 */
public class Demo5 {

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
