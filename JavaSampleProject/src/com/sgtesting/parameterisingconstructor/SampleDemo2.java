package com.sgtesting.parameterisingconstructor;
class Desktop1
{
	String DesktopName;
	String systemType;
	String ProductId;
	String systemProcessor;
	Desktop1(String deskn,String syst,String prid,String sysp)
	{
		DesktopName=deskn;
		systemType=syst;
		ProductId=prid;
		systemProcessor=sysp;
		System.out.println("DesktopName:"+DesktopName);
		System.out.println("systemType:"+systemType);
		System.out.println("ProductId:"+ProductId);
		System.out.println("systemProcessor:"+systemProcessor);
		System.out.println("----------------------------");
	}
}
class Laptop1
{
	String ModelName;
	String Series;
	String Operatingsystem;
	int PriceinIndia;
	Laptop1(String mdname,String srs,String ops,int piI)
	{
		ModelName=mdname;
		Series=srs;
		Operatingsystem=ops;
		PriceinIndia= piI;
		System.out.println("ModelName:"+ModelName);
		System.out.println("Series:"+Series);
		System.out.println("Operatingsystem:"+Operatingsystem);
		System.out.println("PriceinIndia:"+PriceinIndia);
		System.out.println("-----------------------");
	}
}
class MobileDevices1
{
	String DeviceName;
	String Storage;
	int Price;
	String Color;
	MobileDevices1(String dename,String str,int prc,String clr)
	{
		DeviceName=dename;
		Storage=str;
		Price=prc;
		Color=clr;
		System.out.println("DeviceName:"+DeviceName);
		System.out.println("Storage:"+Storage);
		System.out.println("Price:"+Price);
		System.out.println("Color:"+Color);
		System.out.println("-----------------------");
	}

}
public class SampleDemo2 {

	public static void main(String[] args) {
		
		Desktop1 window=new Desktop1("Window 10","64-bit operating system","00330-80000-00000-AA502","Intel(R) Core(TM) i3-7100U CPU @ 2.40GHz 2.40GHz");
		Desktop1 window1=new Desktop1("Window 7","32-bit operating system","0022-50000-00000-AA301","Intel(R) Core(TM) i2-6100S @ 1.54GHz 1.54GHz");
		
		Laptop1 hp=new Laptop1("Hewlett-Packard (HP)","NoteBook","Windows 10",77647);
		Laptop1 dell=new Laptop1("Dell","Note","Windows 7",66543);
		
		MobileDevices1 vivo=new MobileDevices1("VIVO Y35","8GB + 128GB",18499,"Agate Black");
		MobileDevices1 vivo1=new MobileDevices1("VIVO Y16","8GB",9000,"GRAY");

	}

}
