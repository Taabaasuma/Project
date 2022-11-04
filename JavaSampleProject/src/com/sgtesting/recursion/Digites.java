package com.sgtesting.recursion;
class NumDigite
{
	void Digite(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			count++;
		}
		System.out.println("count of number:"+count);
	}
}
public class Digites {

	public static void main(String[] args) {
		NumDigite o1=new NumDigite();
		int a[]= {1,2,3,4,5,};
		o1.Digite(a);

	}

}
