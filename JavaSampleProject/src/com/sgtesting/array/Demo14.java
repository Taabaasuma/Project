package com.sgtesting.array;
/*
 * Java Program to find the sum of each row and each column of a matrix
 */
public class Demo14 {

	public static void main(String[] args) {
		 int X,Y, sumX, sumY; 
		 int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		 X=a.length;
		 Y=a[0].length;
		   for(int i=0;i<X;i++)
		   {    
	            sumX=0;    
	            for(int j=0;j<Y;j++)
	            {    
	              sumX=sumX+a[i][j];    
	            }    
	            System.out.println("Sum of"+(i+1)+"row:"+sumX);    
	        }    
		   for(int i=0;i<Y;i++)
		   {    
	            sumY=0;    
	            for(int j=0;j<X;j++)
	            {    
	              sumY=sumY+a[j][i];    
	            }    
	            System.out.println("Sum of"+(i+1)+"column:"+sumY);    
	        }    

	}

}
