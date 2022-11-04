package com.practice.test;

public class WhileLoop {

	public static void main(String[] args) {
		
		//10 to 20
		//int i=10;
		//while(i<=20)
		{
			//System.out.println(i);
			//i++;
		}
		//60 to 50
		//int i=60;
		//while(i>=50)
		{
			//System.out.println(i);
			//i--;
		}
		//EVEN NUMBERS IN REVERSE ORDER
		//int i=50;
		//while(i>=1)
		{
			//if(i%2==0)
			{
				//System.out.println(i);
			}
			//i--;
		}
		//DIVISIBLE NUMBER
		//int i=100;
		//while(i<=150)
		{
			//if(i%10==0)
			{
				//System.out.println(i);
			}
			//i++;
		}
		//COUNTDIVISIBLE NUMBER
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
