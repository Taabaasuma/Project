package com.practice.test;

public class SwitchBlock {

	public static void main(String[] args) {
		
		//Weeknumber to Weekday
		int X;
		X=3;
		switch(X)
		{
			case 1:
			     System.out.println("1 is Monday");
			     break;
			case 2:
			     System.out.println("2 is Tuesday");
			     break;
			case 3:
			     System.out.println("3 is Wednesday");
			     break;
			case 4:
			     System.out.println("4 is Thursday");
			     break;
			case 5:
			     System.out.println("5 is Friday");
			     break;
			case 6:
			     System.out.println("6 is Saturday");
			     break;
			case 7:
			     System.out.println("7 is Sunday");
			     break;
			default:
			     System.out.println("It is Invalid value");
		}
		//SEASSION
		int X1;
		X1=3;
		switch(X1)
		{
			case 1:
			     System.out.println("Spring");
			     break;
			case 2:
			     System.out.println("Summer");
			     break;
			case 3:
			     System.out.println("Winter");
			     break;
			case 4:
			     System.out.println("Monsoon");
			     break;
			default:
			     System.out.println("Invalid");
		}

	}

}
