package com.dowhilelooppattern.assignment;

public class PatternDemo6 {

	public static void main(String[] args) {
		 int a=1;
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
