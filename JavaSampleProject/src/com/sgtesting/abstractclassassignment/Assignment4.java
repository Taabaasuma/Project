package com.sgtesting.abstractclassassignment;
/*
  4)An abstract class contains static block alone write a programe to execute the static
    block.
 */
abstract class Library
{
	static
	{
		System.out.println("It is a Static block!!");
	}
}
class College extends Library
{
	College()
	{
		System.out.println();
	}
}
public class Assignment4 {

	public static void main(String[] args) {
		College o=new College();

	}

}
