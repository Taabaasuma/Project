package com.whilelooppattern.assignment;

public class PatternDemo5 {

	public static void main(String[] args) {
		
		int a=1;
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(a+" ");
				k++;
				a++;
			}
			System.out.println();
			i++;
		}

	}

}
