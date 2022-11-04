package com.classes.assignment;
class DefaultConstructorExample
{
	int num1;
	int num2;
	int doAddition()
	{
        int result = num1+num2;
        return result;
	}

}
public class sample {

	public static void main(String[] args) {
		DefaultConstructorExample o1=new DefaultConstructorExample();
		o1.num1=10;
		o1.num2=20;
		System.out.println("This method is called using a default constructor");
		o1.doAddition();

	}

}
