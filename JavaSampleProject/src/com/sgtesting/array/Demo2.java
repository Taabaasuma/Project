package com.sgtesting.array;
/*
 * Program to left rotate the elements of an array
 */
public class Demo2 {

	public static void main(String[] args) {
		//Declare the array
		int a[]= {1,2,3,4,5};
		int n=4;
		//Displays original array  
		System.out.println("Original array: ");  
		for (int i=0;i<a.length;i++) 
		{  
			System.out.print(a[i] + " ");  
		}  
		//Rotate the given array by n times toward left  
		for(int i=0;i<n;i++)
		{  
			int j,first;  
			//Stores the first element of the array  
			first=a[0];  
			for(j=0;j<a.length-1;j++)
			{  
				//Shift element of array by one  
				a[j] = a[j+1];  
			}  
			//First element of array will be added to the end  
			a[j]=first;  
		}  
		System.out.println(); 
		//Displays resulting array after rotation  
        System.out.println("Array after left rotation: ");  
        for(int i=0;i<a.length;i++)
        {  
            System.out.print(a[i] + " ");  
        }  

	}

}
