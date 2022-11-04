package com.sgtesting.constructoroverloading;
class Player
{
	Player(String Pname)
	{
		System.out.println("Player name:"+Pname);
	}
	Player(int Pnumber)
	{
		System.out.println("Player Number:"+Pnumber);
	}
	Player(String Pname,String Pgame)
	{
		System.out.println("player name:"+Pname+" Player game:"+Pgame);
	}
}
public class PlayerDemo3 {

	public static void main(String[] args) {
		Player o1=new Player(20);
		Player o2=new Player("Sachin Tendulkar","Cricket");
		Player o3=new Player("Dhoni");
		

	}

}
