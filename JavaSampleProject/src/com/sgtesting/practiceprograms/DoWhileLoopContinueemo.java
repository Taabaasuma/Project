package com.sgtesting.practiceprograms;

public class DoWhileLoopContinueemo {

	public static void main(String[] args) {
		
		int i=10;
		do
		{
			i++;
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
			
		}while(i<=30);

	}

}
