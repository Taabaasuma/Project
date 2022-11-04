package com.sgtesting.constructoroverloading;
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
		System.out.println("Address Code:"+Addresscode);
	}
	Library(String Book,int Addresscode)
	{
		System.out.println("Book:"+Book+" Address Code:"+Addresscode);
	}
}
public class LibraryDemo2 {

	public static void main(String[] args) {
		Library o1=new Library("All type of books are available in library",530001);
		Library o2=new Library("Bengalore","City Central Library");
		Library o3=new Library("Dharwad");

	}

}
