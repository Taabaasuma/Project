package com.dowhilelooppattern.assignment;

public class PatternDemo7 {

	public static void main(String[] args) {
		
		int a=2;
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print(a+" ");
				a+=2;
				k++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
