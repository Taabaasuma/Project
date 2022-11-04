package com.forlooppattern.assignment;

public class PatternDemo7 {

	public static void main(String[] args) {
		
		int a=1;
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(a+" ");
				a+=2;
			}
			System.out.println();
		}

	}

}
