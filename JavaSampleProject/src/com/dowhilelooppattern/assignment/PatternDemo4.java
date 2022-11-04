package com.dowhilelooppattern.assignment;

public class PatternDemo4 {

	public static void main(String[] args) {
		int n=5;
		int i=1;
		do
		{
			int k=5;
			do
			{
				System.out.print(n+" ");
				k--;
			}while(k>=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
