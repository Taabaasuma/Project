package com.sgtesting.inheritencePractice;
class AA
{
	AA()
	{
		System.out.println("It is a AA class Constructor");
	}
}
class BB extends AA
{
	BB()
	{
		System.out.println("It is a BB class Constructor");
	}
}
class CC extends BB
{
	CC()
	{
		System.out.println("It is a CC class Constructor");
	}
}
public class MultilevelNoOrgsConstructor {

	public static void main(String[] args) {
		CC o=new CC();

	}

}
