package com.dowhilelooppattern.assignment;

public class PatternDemo5 {

	public static void main(String[] args) {
		
		int a=1;
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print(a+" ");
				a++;
				k++;
			}while(k<=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
