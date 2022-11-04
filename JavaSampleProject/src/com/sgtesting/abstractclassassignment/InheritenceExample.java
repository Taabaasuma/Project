package com.sgtesting.abstractclassassignment;
abstract class EngineeringCOllege
{
	abstract void displayCollegeName(String name);
	abstract void displayCityName(String name);
	void showBranches(String branches[])
	{
		System.out.println("Branch Name:"+branches);
	}
}
class SLNEngg extends  EngineeringCOllege
{
	void displayCollegeName(String name)
	{
		System.out.println("College Name:"+name);
	}
	void displayCityName(String name)
	{
		System.out.println("City Name:"+name);
	}
	void displayAddress(String name)
	{
		System.out.println("Address Name:"+name);
	}
}
public class InheritenceExample {

	public static void main(String[] args) {
		SLNEngg o=new SLNEngg();
		o.displayCollegeName("SLN ENgineering");
		o.displayCityName("Bengalore");
		String s[]= {"EEE","CS","ECE"};
		o.displayAddress("PRC Layout");
		o.showBranches(s);
		
	}

}
