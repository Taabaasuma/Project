package com.sgtesting.recursion;
class Fibnocy
{
	int Fib(int m)
	{
		if(m==0||m==1)
		{
			return m;
		}
		return (Fib(m-1)+Fib(m-2));
	}
}
public class Fibonocy {

	public static void main(String[] args) {
		Fibnocy obj=new Fibnocy();
		int res=obj.Fib(10);
		System.out.println(res);

	}

}
