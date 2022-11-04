package com.classes.assignment;
class Desktop
{
	String DesktopName;
	String systemType;
	String ProductId;
	String systemProcessor;

}
class Laptop
{
	String ModelName;
	String Series;
	String Operatingsystem;
	int PriceinIndia;

}
class MobileDevices
{
	String DeviceName;
	String Storage;
	int Price;
	String Color;

}

public class MainDemo2 {

	public static void main(String[] args) {
		Desktop window=new Desktop();
		window.DesktopName="Window 10";
		window.systemType="64-bit operating system";
		window.ProductId="00330-80000-00000-AA502";
		window.systemProcessor="Intel(R) Core(TM) i3-7100U CPU @ 2.40GHz 2.40GHz";
		System.out.println("DesktopName:"+window.DesktopName);
		System.out.println("systemType:"+window.systemType);
		System.out.println("ProductId:"+window.ProductId);
		System.out.println("systemProcessor:"+window.systemProcessor);
		System.out.println("----------------------------");
		Laptop hp=new Laptop();
		hp.ModelName="Hewlett-Packard (HP)";
		hp.Series="NoteBook";
		hp.Operatingsystem="Windows 10";
		hp.PriceinIndia= 77647;
		System.out.println("ModelName:"+hp.ModelName);
		System.out.println("Series:"+hp.Series);
		System.out.println("Operatingsystem:"+hp.Operatingsystem);
		System.out.println("PriceinIndia:"+hp.PriceinIndia);
		System.out.println("-----------------------");
		MobileDevices vivo=new MobileDevices();
		vivo.DeviceName="VIVO Y35";
		vivo.Storage="8GB + 128GB";
		vivo.Price=18499;
		vivo.Color="Agate Black";
		System.out.println("DeviceName:"+vivo.DeviceName);
		System.out.println("Storage:"+vivo.Storage);
		System.out.println("Price:"+vivo.Price);
		System.out.println("Color:"+vivo.Color);
		System.out.println("-----------------------");
	}

}
