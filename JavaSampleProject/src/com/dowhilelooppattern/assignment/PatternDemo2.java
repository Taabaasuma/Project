package com.dowhilelooppattern.assignment;

public class PatternDemo2 {

	public static void main(String[] args) {
		
		int n=3;
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print(n+" ");
				k++;
			}while(k<=i);
				System.out.println();
			    i++;
		}while(i<=5);

	}

}
