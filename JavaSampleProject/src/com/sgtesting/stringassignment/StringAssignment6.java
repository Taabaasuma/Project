package com.sgtesting.stringassignment;

public class StringAssignment6 {

	public static void main(String[] args) {
		// Find out the Number of Vowels in Given String
		String s="PROGRAMME";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch =='U'||ch==' ')
			{
				count++;
			}
		}
		System.out.println("Number of vowels in the given sentence is "+count);
		//Find out the Consonanets
		String s1="PROGRAMME";
		int count1=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
				count1++;
			}
		}
		System.out.println("Number of Consonents in the given sentence is "+count1);


	}

}
