package com.sgtesting.stringassignment;
class Practice
{
	static void verifyPali(String str)
	{
		String newStr=new String();
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			newStr+=String.valueOf(ch[i]);
		}
		if(str.equalsIgnoreCase(newStr))
		{
			System.out.println(str+" is a polindrome");
		}
		else
		{
			System.out.println(str+" is not a polindrome");
		}
				
	}
}
public class StringAssignment2 {

	public static void main(String[] args) {
		Practice.verifyPali("KANAK");
	}

}
