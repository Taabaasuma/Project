package com.sgtesting.constructoroverloading;
class Laptop
{
	Laptop(String modelname)
	{
		System.out.println("Model Name:"+modelname);
	}
	Laptop(int PriceInIndia)
	{
		System.out.println("Price In India:"+PriceInIndia);
	}
	Laptop(String modelname,int PriceInIndia)
	{
		System.out.println("Model Name:"+modelname+ " Price In India:"+PriceInIndia);
	}

}
public class LaptopDemo1 {

	public static void main(String[] args) {
		Laptop o1=new Laptop(18950);
		Laptop o2=new Laptop("Dell" , 19500);
		Laptop o3=new Laptop("Hp");
		

	}

}
