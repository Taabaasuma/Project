package com.sgtesting.parameterisingconstructor;
class ParameterizedConstructorExample
{
    int num1;
    int num2;
	public ParameterizedConstructorExample(int Num1, int Num2) 
	{
		num1 = Num1;
		num2 = Num2;
		System.out.println("Num1:"+num1);
		System.out.println("Num2:"+num2);
	}
    
}
public class sample4 {

	public static void main(String[] args) 
	{
		ParameterizedConstructorExample o1=new ParameterizedConstructorExample(10,20);
		ParameterizedConstructorExample o2=new ParameterizedConstructorExample(15,60);
		

	}

}
