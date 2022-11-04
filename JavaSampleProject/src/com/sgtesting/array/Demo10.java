package com.sgtesting.array;

public class Demo10 {

	public static void main(String[] args) {
		int X,Y;
		int a[][]= {{1,2,3},{8,6,4},{4,5,6}};
		X=a.length;
		Y=a[0].length;
		if(X!=Y)
		{
			System.out.println("Matrix should be a square matrix");  
		}
		else
			System.out.println("Lower triangular matrix: ");  
		for(int i=0;i<X;i++)
		{
			for(int j=0;j<Y;j++)
			{
				if(j>i)    
					System.out.print("0 ");    
				else    
					System.out.print(a[i][j]+" ");   
			}
			System.out.println();
		}

	}

}
