package com.dowhileloop.assignment;

public class DivisibleNumberCountDemo5 {

	public static void main(String[] args) {
		
		int count = 0;
		int i=170;
		do
		{
			if(i%5==0)
			{
				count++;
			}
			i--;
		}while(i>=70);
		         System.out.println(count);

	}

}
