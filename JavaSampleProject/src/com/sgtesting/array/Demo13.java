package com.sgtesting.array;

public class Demo13 {

	public static void main(String[] args) {
		int X1,Y1,X2,Y2;
		int a[][]= {{1,3,2},{3,1,1},{1,2,2}};
		int b[][]= {{2,1,1},{1,0,1},{1,3,1}};
		X1=a.length;
		Y1=a[0].length;
		X2=b.length;
		Y2=b[0].length;
		if(Y1!=X2)
		{    
			System.out.println("Matrices cannot be multiplied");    
		}    
		else
		{    
			//Array prod will hold the result    
			int prod[][]=new int[X1][Y2]; 
			for(int i=0;i<X1;i++)
			{    
				for(int j=0;j<Y2;j++)
				{    
					for(int k=0;k<X2;k++)
					{    
						prod[i][j]=prod[i][j]+a[i][k]*b[k][j];     
					}    
				}    
			}
			System.out.println("Product of two matrices: ");    
			for(int i=0;i<X1;i++)
			{    
				for(int j=0;j<Y2;j++)
				{    
					System.out.print(prod[i][j]+" ");    
				}    
				System.out.println();    
			}    
		}

	}
}
