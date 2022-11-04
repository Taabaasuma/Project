package com.sgtesting.parameterisingconstructor;
class Country1
{
	String CountryName;
	String Population;
	String LandArea;
	String Density;
	Country1(String cname,String ppln,String larea,String dsty)
	{
		CountryName=cname;
		Population=ppln;
		LandArea=larea;
		Density=dsty;
		System.out.println("CountryName:"+CountryName);
		System.out.println("Population:"+Population);;
		System.out.println("LandArea:"+LandArea);
		System.out.println("Density:"+Density);
		System.out.println("--------------------------");
	}
}
class States1
{
	String StateName;
	String StateCapital;
	String StateLanguage;
	int Pincode;
	States1(String stname,String scapital,String slanguage,int pcode)
	{
		StateName=stname;
		StateCapital=scapital;
		StateLanguage=slanguage;
		Pincode=pcode;
		System.out.println("StateName:"+StateName);
		System.out.println("StateCapital:"+StateCapital);
		System.out.println("StateLanguage:"+StateLanguage);
		System.out.println("Pincode:"+Pincode);
		System.out.println("----------------------------");
	}
}
class District1
{
	String DistrictName;
	String GovernmentType;
	String Density;
	String Literacy;
	District1(String dname,String gtype,String dsity,String ltracy)
	{
		DistrictName=dname;
		GovernmentType=gtype;
		Density=dsity;
		Literacy=ltracy;
		System.out.println("DistrictName:"+DistrictName);
		System.out.println("GovernmentType:"+GovernmentType);
		System.out.println("Density:"+Density);
		System.out.println("Literacy:"+Literacy);
		System.out.println("----------------------------");
	}
}
class Village1
{
	String VillageName;
	String GovernmentBody;
	String Area;
	String Density;
	Village1(String vname,String Gtype,String area,String dnsity)
	{
		VillageName=vname;
		GovernmentBody=Gtype;
		Area=area;
		Density=dnsity;
		System.out.println("VillageName:"+VillageName);
		System.out.println("GovernmentBody:"+GovernmentBody);
		System.out.println("Area:"+Area);
		System.out.println("Density:"+Density);
		System.out.println("---------------------");
	}
}
public class SampleDemo6 {

	public static void main(String[] args) {
		
		Country1 australia=new Country1("AUSTRALIA","2,54,99,884","7,682,300 KM2","3P/KM2");
		Country1 india=new Country1("INDIA","138 crores (2020)","3.287 million km²","382 per sq km");
		
		States1 karnataka=new States1("Karanataka","Bengalore","Kannada",560001);
		States1 bihar=new States1("Bihar","Patna","Hindi",803101);
		
		District1 bellary=new District1("BELLARY","Municipal Corporation","8,600/km2 (22,000/sq mi)","79%");
		District1 belgaum=new District1("BELGAUM","Democracy","5,200/km2 (14,000/sq mi)","85.56 %");
		
		Village1 hp=new Village1("HARAPANAHALLI","Harapanahalli Town Municipal Council (TMC)","6.98 km2 (2.69 sq mi)","6,000/km2 (16,000/sq mi)");
		Village1 honnahall=new Village1("Honnahalli","District Minority welfare","7.68km2","2,149");
	}

}
