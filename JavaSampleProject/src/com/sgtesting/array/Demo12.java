package com.sgtesting.array;

public class Demo12 {

	public static void main(String[] args) {
		int X,Y;
		int countEven=0;
		int countOdd=0;

		int a[][]= {{4,1,3},{3,5,7},{8,2,6}};
		X=a.length;
		Y=a[0].length;
		for(int i=0;i<X;i++)
		{
			for(int j=0;j<Y;j++)
			{
				if(a[i][j]%2==0)
					countEven++; 
				else
					countOdd++;    
			}
		}
		System.out.println("Frequency of odd numbers: " + countOdd);    
        System.out.println("Frequency of even numbers: " + countEven);  
	}

}
