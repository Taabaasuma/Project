package com.sgtesting.stati;
class Maths4
{
	{
		System.out.println("It is a first Instance Block");
	}
}
class Maths5
{
	{
		Maths4 o=new Maths4();
		System.out.println("It is a second  Instance Block");
	}
}
public class InstanceBlock {

	public static void main(String[] args) {
		Maths5 o=new Maths5();

	}

}
