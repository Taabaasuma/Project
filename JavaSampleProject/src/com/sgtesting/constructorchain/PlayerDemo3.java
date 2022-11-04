package com.sgtesting.constructorchain;
class Player
{
	Player(String Pname)
	{
		System.out.println("Player name:"+Pname);
	}
	Player(int Pnumber)
	{
		this("Jadeja");
		System.out.println("Player Number:"+Pnumber);
	}
	Player(String Pname,String Pgame)
	{
		this(2);
		System.out.println("player name:"+Pname+" Player game:"+Pgame);
	}
}
public class PlayerDemo3 {

	public static void main(String[] args) {
		Player o1=new Player("Virat Kholi");
		Player o2=new Player(11);
		Player o3=new Player("Sachin Tendulkar","Cricket");

	}

}
