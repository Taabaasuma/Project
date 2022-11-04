package com.sgtesting.stati;
class Maths1
{
	static void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
}
public class IndependentclassStaticmembers {

	public static void main(String[] args) {
		Maths1.addition(20, 30);

	}

}
