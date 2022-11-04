package com.forlooppattern.assignment;

public class PatternDemo4 {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>=i;k--)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}

	}

}
