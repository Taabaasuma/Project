package com.sgtesting.practice;
class Sample
{
	static Sample obj=null;
	private Sample()
	{
		//It is private constructor
	}
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
	void substraction(int x,int y)
	{
		int res=(x-y);
		System.out.println("Substraction Result:"+res);
	}
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("Multiplictaion Result:"+res);
	}
	static Sample getInstance()
	{
		if(obj==null)
		{
			obj=new Sample();
		}
		return obj;
	}
}
public class Example11 {

	public static void main(String[] args) {
		Sample o=Sample.getInstance();
		o.addition(10, 20);
		o.substraction(20, 10);
		System.out.println("--------------------------");
		Sample o1=Sample.getInstance();
		o1.addition(10, 30);
		o1.substraction(20, 5);
		System.out.println("---------------------------");
		Sample o2=Sample.getInstance();
		o2.addition(10, 20);
		o2.substraction(20, 2);
		
		if(o==o1 && o1==o2)
		{
			System.out.println("All object have Same reference!!");
		}
		else
		{
			System.out.println("All object do not have Same reference!!");
		}

	}

}
