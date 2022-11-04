package com.sgtesting.array;
/*
 * Java Program to determine whether two matrices are equal
 */
public class Demo7 {

	public static void main(String[] args) {
		int X1, Y1, X2, Y2;    
		boolean flag = true;    
		int a[][]= {{1, 2, 3},{8, 4, 6},{4, 5, 7}};
		int b[][]= {{1, 2, 3},{8,4,6},{4,5,7}};
		//Calculates the number of rows and columns present in the first matrix    
		X1=a.length;    
		Y1 =a[0].length;    
		//Calculates the number of rows and columns present in the second matrix   
		X2 = b.length;    
		Y2 = b[0].length;    
		if(X1!=X2||Y1!=Y2)
		{    
			System.out.println("Matrices are not equal");    
		}    
		else 
		{    
			for(int i=0;i<X1;i++)
			{    
				for(int j=0;j<Y1;j++)
				{    
					if(a[i][j]!=b[i][j])
					{    
						flag=false;    
						break;    
					}    
				}    
			}    
			if(flag)    
				System.out.println("Matrices are equal");    
			else    
				System.out.println("Matrices are not equal");   
		}
	}
}