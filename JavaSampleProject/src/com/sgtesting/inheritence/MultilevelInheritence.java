package com.sgtesting.inheritence;
class Engineer
{
	void design()
	{
		System.out.println("Design the Plan");
	}
}
class Contractor extends Engineer
{
	void exicute()
	{
		System.out.println("Exicute the Plan");
	}
}
class Client extends Contractor
{
	void utilize()
	{
		System.out.println("Utilize the Plan");
	}
}
public class MultilevelInheritence {

	public static void main(String[] args) {
		Client c=new Client();
		c.design();
		c.exicute();
		c.utilize();

	}

}
