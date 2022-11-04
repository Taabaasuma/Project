package com.sgtesting.stringassignment;
class Demo1
{
	static void display()
	{
		StringBuffer s=new StringBuffer("The Temple is At the top of the hill");
		StringBuffer s1=s.reverse();
		System.out.println("Reverse String:"+s1);
	}
}
class Practice1
{
	static void reverseWords(String str)
	{
		String s[]=str.split(" ");
		String wordreverse=new String();
		for(int i=0;i<s.length;i++)
		{
			String rev=new String();
			char ch[]=s[i].toCharArray();
			for(int j=s[i].length()-1;j>=0;j--)
			{
				rev+=String.valueOf(ch[j]);
			}
			wordreverse+=rev.concat(" ");
		}
		System.out.println(wordreverse);
	}
}
public class StringAssignment5 {

	public static void main(String[] args) {
		Demo1.display();
		Practice1.reverseWords("The Temple is at the top of hoill");
		

	}

}
