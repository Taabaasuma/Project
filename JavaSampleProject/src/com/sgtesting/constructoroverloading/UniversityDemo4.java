package com.sgtesting.constructoroverloading;
class University
{
	University(String Uname)
	{
		System.out.println("University Name:"+Uname);
	}
	University(int establishment)
	{
		System.out.println("Establishment:"+establishment);
	}
	University(String Uname,int establishment)
	{
		System.out.println("University Name:"+Uname+" Establishment:"+establishment);
	}
}
	
public class UniversityDemo4 {

	public static void main(String[] args) {
		University o1=new University("VTU");
		University o2=new University(1986);
		University o3=new University("Belgavi",1888);

	}

}
