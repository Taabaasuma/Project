package com.sgtesting.methods;
class Demo5
{
	void table(int num)
	{
		for(int i=1;i<=10;i++)
		{
			int res=num*i;
			System.out.println(num+"*"+i+"="+res);
		}
		
	}
}
public class Table {

	public static void main(String[] args) {
		Demo5 o1=new Demo5();
		o1.table(3);

	}

}
