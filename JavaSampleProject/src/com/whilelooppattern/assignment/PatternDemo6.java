package com.whilelooppattern.assignment;

public class PatternDemo6 {

	public static void main(String[] args) {
		
		int a=2;
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(a+" ");
				a+=2;
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
