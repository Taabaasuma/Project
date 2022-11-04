package com.sgtesting.noargsconstructor;

class Students
{
	String SName;
	int SID;
	int Marks;
	String Branch;
	Students()
	{
		SName="Santhosh";
		SID=10;
		Marks=500;
		Branch="EEE";
		System.out.println("SName:"+SName);
		System.out.println("SID:"+SID);
		System.out.println("Marks:"+Marks);
		System.out.println("Branch:"+Branch);
		System.out.println("------------------------");
	}
}
class University
{
	String UniversityName;
	String Address;
	int Established;
	String Course;
	University()
	{
		UniversityName="Rani Channamma University,Dharwad";
		Address="Vidya Sangama,P B R H - 4,Karnataka 591156";
		Established=1982;
		Course="Engineering Course";
		System.out.println("UniversityName:"+UniversityName);
		System.out.println("Address:"+Address);
		System.out.println("Established:"+Established);
		System.out.println("Course:"+Course);
		System.out.println("---------------------------");
	}

}
class Library
{
	String Place;
	String LibName;
	String Address;
	String Books;
	Library()
	{
		Place="Bengalore";
		LibName="City Central Library";
		Address="110-105, 8th A Cross Rd, Govindaraja Nagar Ward, Kesava Upanagara, Vijayanagar, Bengaluru, Karnataka 560079";
		Books="All Type of Books are Avilable";
		System.out.println("Place:"+Place);
		System.out.println("LibName:"+LibName);
		System.out.println("Address:"+Address);
		System.out.println("Books:"+Books);
		System.out.println("---------------------------");
	}
}
class Sports
{
	String SportName;
	int  NoOfPlayers;
	int NoOfTeam;
	String Rules;
	Sports()
	{
		SportName="CRICKET";
		NoOfPlayers=11;
		NoOfTeam=2;
		Rules="42 Laws";
		System.out.println("SportName:"+SportName);
		System.out.println("NoOfPlayers:"+NoOfPlayers);
		System.out.println("NoOfTeam:"+NoOfTeam);
		System.out.println("Rules:"+Rules);
		System.out.println("-------------------------------");
	}
}
public class MainDemo5 {

	public static void main(String[] args) {

		Students santu=new Students();
		
		University rani=new University();
		
		Library city=new Library();
		
		Sports cricket=new Sports();
		
	}

}
