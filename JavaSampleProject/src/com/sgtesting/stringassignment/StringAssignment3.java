package com.sgtesting.stringassignment;

public class StringAssignment3 {

	public static void main(String[] args) {
		//By using ToCharrArray
		System.out.println("ToCharArray Revers of Language without using Reverse Method");
		String s="Language";
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		//By using CharAt
		System.out.println("By Using charAt reverse the charcater without using Reverse Method");
		String s1="Kavi";
		char ch1=s1.charAt(3);
		System.out.print(ch1);
		char ch2=s1.charAt(2);
		System.out.print(ch2);
		char ch3=s1.charAt(1);
		System.out.print(ch3);
		char ch4=s1.charAt(0);
		System.out.print(ch4);
		System.out.println();
		//By using Substring
		System.out.println("By Using SubString to reverse the character without using reverse Method");
		String s2="Radar";
		String s3=s2.substring(0,5);
		System.out.println(s3);
		
		
		
	}

}
