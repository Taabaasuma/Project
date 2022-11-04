package com.sgtesting.noargsconstructor;

class Country
{
	String CountryName;
	String Population;
	String LandArea;
	String Density;
	Country()
	{
		CountryName="AUSTRALIA";
		Population="2,54,99,884";
		LandArea="7,682,300 KM2";
		Density="3P/KM2";
		System.out.println("CountryName:"+CountryName);
		System.out.println("Population:"+Population);;
		System.out.println("LandArea:"+LandArea);
		System.out.println("Density:"+Density);
		System.out.println("--------------------------");
	}
}
class States
{
	String StateName;
	String StateCapital;
	String StateLanguage;
	int Pincode;
	States()
	{
		StateName="Karanataka";
		StateCapital="Bengalore";
		StateLanguage="Kannada";
		Pincode=560001;
		System.out.println("StateName:"+StateName);
		System.out.println("StateCapital:"+StateCapital);
		System.out.println("StateLanguage:"+StateLanguage);
		System.out.println("Pincode:"+Pincode);
		System.out.println("----------------------------");
	}
}
class District
{
	String DistrictName;
	String GovernmentType;
	String Density;
	String Literacy;
	District()
	{
		DistrictName="BELLARY";
		GovernmentType="Municipal Corporation";
		Density="8,600/km2 (22,000/sq mi)";
		Literacy="79%";
		System.out.println("DistrictName:"+DistrictName);
		System.out.println("GovernmentType:"+GovernmentType);
		System.out.println("Density:"+Density);
		System.out.println("Literacy:"+Literacy);
		System.out.println("----------------------------");
	}
}
class Village
{
	String VillageName;
	String GovernmentBody;
	String Area;
	String Density;
	Village()
	{
		VillageName="HARAPANAHALLI";
		GovernmentBody="Harapanahalli Town Municipal Council (TMC)";
		Area="6.98 km2 (2.69 sq mi)";
		Density="6,000/km2 (16,000/sq mi)";
		System.out.println("VillageName:"+VillageName);
		System.out.println("GovernmentBody:"+GovernmentBody);
		System.out.println("Area:"+Area);
		System.out.println("Density:"+Density);
		System.out.println("---------------------");
	}
}
public class MainDemo6 {

	public static void main(String[] args) {

		Country australia=new Country();
		
		States karnataka=new States();
		
		District bellary=new District();
		
		Village hp=new Village();

	}

}
