package com.sgtesting.inheritence;
class Test1
{
	void show1()
	{
		System.out.println("Show Details of Test1");
	}
}
class Test2 extends Test1
{
	void show2()
	{
		System.out.println("SHow Details of Test2");
		System.out.println("---------------------------------");
	}
}
class Test3 extends Test1
{
	void show3()
	{
		System.out.println("Show Details of Test3");
	}
}
class Test4 extends Test3
{
	void show4()
	{
		System.out.println("Show Details of Test4");
	}
}
public class HybridInheritence {

	public static void main(String[] args) {
		Test2 o1=new Test2();
		o1.show1();
		o1.show2();
		
		Test4 o2=new Test4();
		o2.show1();
		o2.show3();
		o2.show4();

	}

}
