package com.sgtesting.noargsconstructor;
class Desktop
{
	String DesktopName;
	String systemType;
	String ProductId;
	String systemProcessor;
	Desktop()
	{
		DesktopName="Window 10";
		systemType="64-bit operating system";
		ProductId="00330-80000-00000-AA502";
		systemProcessor="Intel(R) Core(TM) i3-7100U CPU @ 2.40GHz 2.40GHz";
		System.out.println("DesktopName:"+DesktopName);
		System.out.println("systemType:"+systemType);
		System.out.println("ProductId:"+ProductId);
		System.out.println("systemProcessor:"+systemProcessor);
		System.out.println("----------------------------");
	}

}
class Laptop
{
	String ModelName;
	String Series;
	String Operatingsystem;
	int PriceinIndia;
	Laptop()
	{
		ModelName="Hewlett-Packard (HP)";
		Series="NoteBook";
		Operatingsystem="Windows 10";
		PriceinIndia= 77647;
		System.out.println("ModelName:"+ModelName);
		System.out.println("Series:"+Series);
		System.out.println("Operatingsystem:"+Operatingsystem);
		System.out.println("PriceinIndia:"+PriceinIndia);
		System.out.println("-----------------------");
	}

}
class MobileDevices
{
	String DeviceName;
	String Storage;
	int Price;
	String Color;
	MobileDevices()
	{
		DeviceName="VIVO Y35";
		Storage="8GB + 128GB";
		Price=18499;
		Color="Agate Black";
		System.out.println("DeviceName:"+DeviceName);
		System.out.println("Storage:"+Storage);
		System.out.println("Price:"+Price);
		System.out.println("Color:"+Color);
		System.out.println("-----------------------");
	}

}

public class MainDemo2 {

	public static void main(String[] args) {
		Desktop window=new Desktop();
		
		Laptop hp=new Laptop();
		
		MobileDevices vivo=new MobileDevices();
		
	}

}
