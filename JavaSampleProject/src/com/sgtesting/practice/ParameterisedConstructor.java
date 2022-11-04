package com.sgtesting.practice;
class Sports
{
	String SportsName;
	String Splayername;
	Sports(String SportsName,String Splayername)
	{
		this.SportsName=SportsName;
		this.Splayername=Splayername;
		System.out.println("Sports name:"+SportsName);
		System.out.println("Sprots Player Name:"+Splayername);
	}
	
}
public class ParameterisedConstructor {

	public static void main(String[] args) {
		Sports o=new Sports("Cricket","Sachin Tendulkar");
		Sports o1=new Sports("Cricket","Virat Kohli");

	}

}
