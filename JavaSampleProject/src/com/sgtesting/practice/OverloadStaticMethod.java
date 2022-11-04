package com.sgtesting.practice;
class Demo
{
	static void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
	static void addition(int x,int y,int z)
	{
		int res=(x+y+z);
		System.out.println("Addition Result:"+res);
	}
}
public class OverloadStaticMethod {

	public static void main(String[] args) {
		Demo.addition(20,30);
		Demo.addition(20,30,20);
		

	}

}
