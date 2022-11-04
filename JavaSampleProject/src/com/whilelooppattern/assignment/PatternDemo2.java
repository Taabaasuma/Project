package com.whilelooppattern.assignment;

public class PatternDemo2 {

	public static void main(String[] args) {
		int n=3;
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(n+" ");
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
