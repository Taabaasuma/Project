package com.sgtesting.constructorchain;
class MetroCity
{
	MetroCity(String MCityname)
	{
		System.out.println("Metro City Name:"+MCityname);
	}
	MetroCity(int population)
	{
		this("Bengalore");
		System.out.println("Metro City Population:"+population);
	}
	MetroCity(String MCityname,int population)
	{
		this(25735000);
		System.out.println("Metro city Name:"+MCityname+" Metro City Population:"+population);
	}
	
}
public class MetroCityDemo5 {

	public static void main(String[] args) {
		MetroCity o1=new MetroCity(13193000);
		MetroCity o2=new MetroCity("Kolkata");
		MetroCity o3=new MetroCity("Delhi",25735000);

	}

}
