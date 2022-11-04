package com.whileloop.assignment;

public class DivisibleNumberCountDemo4 {

	public static void main(String[] args) {
		
		int count = 0;
		int i=30;
		while(i<=90)
		{
			if(i%6==0)
			{
				count++;
			}
			i++;
		}
		System.out.println(count);
	}

}
