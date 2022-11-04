package com.sgtesting.parameterisingconstructor;

class Students
{
	String SName;
	int SID;
	int Marks;
	String Branch;
}
class University
{
	String UniversityName;
	String Address;
	int Established;
	String Course;

}
class Library
{
	String Place;
	String LibName;
	String Address;
	String Books;
}
class Sports
{
	String SportName;
	int  NoOfPlayers;
	int NoOfTeam;
	String Rules;
}

public class MainDemo5 {

	public static void main(String[] args) {

		Students santu=new Students();
		santu.SName="Santhosh";
		santu.SID=10;
		santu.Marks=500;
		santu.Branch="EEE";
		System.out.println("SName:"+santu.SName);
		System.out.println("SID:"+santu.SID);
		System.out.println("Marks:"+santu.Marks);
		System.out.println("Branch:"+santu.Branch);
		System.out.println("------------------------");
		University rani=new University();
		rani.UniversityName="Rani Channamma University,Dharwad";
		rani.Address="Vidya Sangama,P B R H - 4,Karnataka 591156";
		rani.Established=1982;
		rani.Course="Engineering Course";
		System.out.println("UniversityName:"+rani.UniversityName);
		System.out.println("Address:"+rani.Address);
		System.out.println("Established:"+rani.Established);
		System.out.println("Course:"+rani.Course);
		System.out.println("---------------------------");
		Library city=new Library();
		city.Place="Bengalore";
		city.LibName="City Central Library";
		city.Address="110-105, 8th A Cross Rd, Govindaraja Nagar Ward, Kesava Upanagara, Vijayanagar, Bengaluru, Karnataka 560079";
		city.Books="All Type of Books are Avilable";
		System.out.println("Place:"+city.Place);
		System.out.println("LibName:"+city.LibName);
		System.out.println("Address:"+city.Address);
		System.out.println("Books:"+city.Books);
		System.out.println("---------------------------");
		Sports cricket=new Sports();
		cricket.SportName="CRICKET";
		cricket.NoOfPlayers=11;
		cricket.NoOfTeam=2;
		cricket.Rules="42 Laws";
		System.out.println("SportName:"+cricket.SportName);
		System.out.println("NoOfPlayers:"+cricket.NoOfPlayers);
		System.out.println("NoOfTeam:"+cricket.NoOfTeam);
		System.out.println("Rules:"+cricket.Rules);
		System.out.println("-------------------------------");
	}

}
