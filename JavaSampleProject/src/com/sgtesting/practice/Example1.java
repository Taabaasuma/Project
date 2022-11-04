package com.sgtesting.practice;
abstract class EngineeringCollege
{
	abstract void displayCollegeName(String name);
	abstract void displayCityName(String name);
}
class SNLEngg extends EngineeringCollege
{
	void displayCollegeName(String name)
	{
		System.out.println("College Name:"+name);
	}
	void displayCityName(String name)
	{
		System.out.println("City Name:"+name);
	}
}
class Library extends SNLEngg
{
	void displayLibraryName(String name)
	{
		System.out.println("Library Name:"+name);
	}
}
public class Example1 {

	public static void main(String[] args) {
		Library o=new Library();
		o.displayCollegeName("STJIT college");
		o.displayCityName("Ranebennure");
		o.displayLibraryName("City Central");

	}

}
