package com.sgtesting.practice;
class Birds
{
	Birds(String Birdname)
	{
		System.out.println("Bird Name:"+Birdname);
	}
	Birds(String Birdname,String Birdcolor)
	{
		System.out.println("Bird Name:"+Birdname+" Bird Color:"+Birdcolor);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		 Birds o=new  Birds("Sparrow","Brown");
		 Birds o1=new  Birds("Parrot");
		 
	}

}
