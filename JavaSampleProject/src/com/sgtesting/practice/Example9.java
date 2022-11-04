package com.sgtesting.practice;
class Demoa 
{
	Demoa()
	{
		System.out.println("It is a no orgs constructor");
	}
}
class Demob extends Demoa
{
	Demob()
	{
		System.out.println("It is a second no orgs constructor");
	}
}
class Democ extends Demoa
{
	Democ()
	{
		System.out.println("It is a third no orgs constructor");
	}
}
class Demod extends Democ
{
	Demod()
	{
		System.out.println("It is a fourth no orgs constructor");
	}
}
public class Example9 {

	public static void main(String[] args) {
		Demob o=new Demob();
		System.out.println("-----------------------");
		Demod o1=new Demod();

	}

}
