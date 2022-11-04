package com.sgtesting.inheritencePractice;
class Country
{
	void show(String Capitalcity)
	{
		System.out.println("Capital city of Country:"+Capitalcity);
	}
}
class State extends Country
{
	State(String city)
	{
		super.show(city);
	}
	void show(String Capitalcity)
	{
		System.out.println("Capital city of State:"+Capitalcity);
	}
}
public class SameMethodSimpleInheritence {

	public static void main(String[] args) {
		State o=new State("Delhi");
		o.show("Bengalore");

	}

}
