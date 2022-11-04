package com.whilelooppattern.assignment;

public class PatternDemo7 {

	public static void main(String[] args) {
		
		int a=1;
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
