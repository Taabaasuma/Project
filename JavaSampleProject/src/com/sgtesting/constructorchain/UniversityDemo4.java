package com.sgtesting.constructorchain;
class University
{
	University(String Uname)
	{
		this(1992);
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
		University o1=new University(1993);
		University o2=new University("Belgavi",1887);
		University o3=new University("VTU");
		

	}

}
