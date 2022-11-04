package com.practice.test;

public class NestedIfELse {

	public static void main(String[] args) {
		
		//WeekdayNumber to WeekDay Name
		int weekday=6;
		if(weekday==1)
		{
			System.out.println("It is a Monday:"+weekday);
		}
		else if(weekday==2)
		{
			System.out.println("It is a Tuesday:"+weekday);
		}
		else if(weekday==3)
		{
			System.out.println("It is a Wednesday:"+weekday);
		}
		else if(weekday==4)
		{
			System.out.println("It is a Thursday:"+weekday);
		}
		else if(weekday==5)
		{
			System.out.println("It is a Friday:"+weekday);
		}
		else if(weekday==6)
		{
			System.out.println("It is a Saturday:"+weekday);
		}
		else if(weekday==7)
		{
			System.out.println("It is a Sunday:"+weekday);
		}
		else
		{
			System.out.println("It is Invalid Weekday");
		}	
		//Greatest Number
		int num1=30;
		int num2=60;
		int num3=20;
		if(num1<num2)
		{
			System.out.println("num2 is a Greatest Number");
		}
		else if(num2>num3)
		{
			System.out.println("num2 is a greater Number");
		}
		else if(num3<num1)
		{
			System.out.println("num1 is greater");
		}
		else
		{
			System.out.println("Invalid number");
		}
		//vowel
		char ch='e';
		if(ch=='A')
		{
			System.out.println("It is a Vowel:"+ch);
		}
		else if(ch=='E')
		{
			System.out.println("It is a Vowel:"+ch);
		}
		else if(ch=='I')
		{
			System.out.println("I is a Vowel:"+ch);
		}
		else if(ch=='O')
		{
			System.out.println("It is a Vowel:"+ch);
		}
		else if(ch=='U')
		{
			System.out.println("It is a Vowel:"+ch);
		}
		else if(ch=='a')
		{
			System.out.println("It is a Vowel:"+ch);
		}
		else if(ch=='e')
		{
			System.out.println("It is a Vowel:"+ch);
		}
		else if(ch=='i')
		{
			System.out.println("It is a Vowel:"+ch);
		}
		else if(ch=='o')
		{
			System.out.println("It is a Vowel:"+ch);
		}
		else if(ch=='u')
		{
			System.out.println("It is a Vowel:"+ch);
		}
		else
		{
			System.out.println("It is Not a Vowel");
		}
		//Digits
		int num=10;
		if(num>=10 && num<=99)
		{
			System.out.println("Number contains 2 Digits");
		}
		else if(num>=100 && num<=999)
		{
			System.out.println("Number contains 3 Digits");
		}
		else if(num>=1000 && num<=9999)
		{
			System.out.println("Number contains 4 Digits");
		}
		else
		{
			System.out.println("Number contains more than 4 Digits");
		}

	}

}
