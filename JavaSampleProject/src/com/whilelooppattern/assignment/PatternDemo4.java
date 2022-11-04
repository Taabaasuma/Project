package com.whilelooppattern.assignment;

public class PatternDemo4 {

	public static void main(String[] args) {
		
		int n=5;
		int i=1;
		while(i<=n)
		{
			int k=n;
			while(k>=i)
			{
				System.out.print(n+" ");
				k--;
			}
			System.out.println();
			i++;
				
		}

	}

}
