package com.sgtesting.array;
/*
    Program to copy all elements of one array into another array
 */
public class SingleArray1 {

	public static void main(String[] args) {
		//Declare array     
		int arr1[]={1, 2, 3, 4, 5,6};  
		//Create another array to copy the arr1 elements
		int arr2[]=new int[arr1.length];
		//Copying all elements of one array into another    
        for(int i=0;i<arr1.length;i++)
        {     
            arr2[i] = arr1[i];    
        }     
        System.out.println("Elements of original array:");  
        for (int i=0;i<arr1.length;i++) 
        {     
            System.out.print(arr1[i] + " ");    
        }    
        System.out.println();   
        //Declare the new array
        System.out.println("Elements of new array:");  
        for (int i=0;i<arr2.length;i++) 
        {     
            System.out.print(arr2[i] + " ");    
        }     
        System.out.println();
        //first half
        System.out.println("first half of array:");
        for(int i=0;i<arr2.length/2;i++)
        {
        	System.out.println(arr2[i]+" ");
        }
        System.out.println();
        //second half
        System.out.println("Second half of array:");
        for(int i=arr2.length/2;i<arr2.length;i++)
        {
        	System.out.println(arr2[i]+" ");
        }
        System.out.println();

	}

}
