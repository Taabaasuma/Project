package com.whilelooppattern.assignment;

public class PatternDemo9 {

	public static void main(String[] args) {
		
		int i=1;
		while(i<=5)
		{
			int k=5;
			while(k>=i)
			{
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
			i++;
		}

	}

}
