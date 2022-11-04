package com.sgtesting.constructorchain;
class Laptop
{
	Laptop(String modelname)
	{
		System.out.println("Model Name:"+modelname);
	}
	Laptop(int PriceInIndia)
	{
		this("ASUS");
		System.out.println("Price In India:"+PriceInIndia);
	}
	Laptop(String modelname,int PriceInIndia)
	{
		System.out.println("Model Name:"+modelname+ " Price In India:"+PriceInIndia);
	}

}
public class Laptopdemo1 {

	public static void main(String[] args) {
	Laptop o1=new Laptop("Dell",19900);
	Laptop o2=new Laptop("Lenovo");
	Laptop o3=new Laptop(25000);

	}

}
