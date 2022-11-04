package com.sgtesting.parameterisingconstructor;
class Students1
{
	String SName;
	int SID;
	int Marks;
	String Branch;
	Students1(String sname,int sid,int marks,String branch)
	{
		SName=sname;
		SID=sid;
		Marks=marks;
		Branch=branch;
		System.out.println("SName:"+SName);
		System.out.println("SID:"+SID);
		System.out.println("Marks:"+Marks);
		System.out.println("Branch:"+Branch);
		System.out.println("------------------------");
	}
}
class University1
{
	String UniversityName;
	String Address;
	int Established;
	String Course;
	University1(String unvsty,String add,int est,String crs)
	{
		UniversityName=unvsty;
		Address=add;
		Established=est;
		Course=crs;
		System.out.println("UniversityName:"+UniversityName);
		System.out.println("Address:"+Address);
		System.out.println("Established:"+Established);
		System.out.println("Course:"+Course);
		System.out.println("---------------------------");
	}
}
class Library1
{
	String Place;
	String LibName;
	String Address;
	String Books;
	Library1(String plc,String Lbname,String add,String bk)
	{
		Place=plc;
		LibName=Lbname;
		Address=add;
		Books=bk;
		System.out.println("Place:"+Place);
		System.out.println("LibName:"+LibName);
		System.out.println("Address:"+Address);
		System.out.println("Books:"+Books);
		System.out.println("---------------------------");
	}
}
class Sports1
{
	String SportName;
	int  NoOfPlayers;
	int NoOfTeam;
	String Rules;
	Sports1(String sname,int nofp,int not,String rls)
	{
		SportName=sname;
		NoOfPlayers=nofp;
		NoOfTeam=not;
		Rules=rls;
		System.out.println("SportName:"+SportName);
		System.out.println("NoOfPlayers:"+NoOfPlayers);
		System.out.println("NoOfTeam:"+NoOfTeam);
		System.out.println("Rules:"+Rules);
		System.out.println("-------------------------------");
	}
}
public class SampleDemo5 {

	public static void main(String[] args) {
		
		Students1 santu=new Students1("Santhosh",10,500,"EEE");
		Students1 ravi=new Students1("Ravi Kumar",20,600,"ECE");
		
		University1 rani=new University1("Rani Channamma University,Dharwad","Vidya Sangama,P B R H - 4,Karnataka 591156",1982,"Engineering Course");
		University1 vtu=new University1("Vishveshwarya Technology University","Ranebbenur Haveri(D)",1992,"Engineering COurse");
		
		Library1 city=new Library1("Bengalore","City Central Library","110-105, 8th A Cross Rd, Govindaraja Nagar Ward, Kesava Upanagara, Vijayanagar, Bengaluru, Karnataka 560079","All Type of Books are Avilable");
		Library1 city1=new Library1("Harapanahalli","City central","IB circle, Harapanahalli, Karnataka 560079","All Type of Books are Avilable");
		
		Sports1 cricket=new Sports1("CRICKET",11,2,"42 Laws");
		Sports1 football=new Sports1("FootBall",11,2,"17 Laws");
		
	}

}
