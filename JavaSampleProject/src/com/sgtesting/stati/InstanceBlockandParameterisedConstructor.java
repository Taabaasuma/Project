package com.sgtesting.stati;
class Demo6
{
	{
		Demo7 o=new Demo7("Santhosh");
		System.out.println("It is a Instance block");
	}
}
class Demo7
{
     Demo7(String firstname)
     {
    	 System.out.println("Name:"+firstname);
     }
}
public class InstanceBlockandParameterisedConstructor {

	public static void main(String[] args) {
		Demo6 o=new Demo6();

	}

}
