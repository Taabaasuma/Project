package com.sgtesting.constructorchain;
class Library
{
	Library(String Place)
	{
		System.out.println("Place:"+Place);
	}
	Library(String Place,String LibName)
	{
		System.out.println("Place:"+Place+" Library Name:"+LibName);
	}
	Library(int Addresscode)
	{
		this("Davanagere");
		System.out.println("Address Code:"+Addresscode);
	}
	Library(String Book,int Addresscode)
	{
		this(5410002);
		System.out.println("Book:"+Book+" Address Code:"+Addresscode);
	}
}
public class LibraryDemo2 {

	public static void main(String[] args) {
		Library o1=new Library(810005);
		Library o2=new Library("Bengalore","City Central Library");
		Library o3=new Library("Core java",910005);

	}

}
