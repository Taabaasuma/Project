package com.sgtesting.constructoroverloading;
class MetroCity
{
	MetroCity(String MCityname)
	{
		System.out.println("Metro City Name:"+MCityname);
	}
	MetroCity(int population)
	{
		System.out.println("Metro City Population:"+population);
	}
	MetroCity(String MCityname,int population)
	{
		System.out.println("Metro city Name:"+MCityname+" Metro City Population:"+population);
	}
	
}
public class MetroCityDemo5 {

	public static void main(String[] args) {
		MetroCity o1=new MetroCity("Mumbai");
		MetroCity o2=new MetroCity(20800000);
		MetroCity o3=new MetroCity("Delhi",25735000);

	}

}
