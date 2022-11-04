package com.classes.assignment;

class Country
{
	String CountryName;
	String Population;
	String LandArea;
	String Density;
}
class States
{
	String StateName;
	String StateCapital;
	String StateLanguage;
	int Pincode;
}
class District
{
	String DistrictName;
	String GovernmentType;
	String Density;
	String Literacy;
}
class Village
{
	String VillageName;
	String GovernmentBody;
	String Area;
	String Density;
}
public class MainDemo6 {

	public static void main(String[] args) {

		Country australia=new Country();
		australia.CountryName="AUSTRALIA";
		australia.Population="2,54,99,884";
		australia.LandArea="7,682,300 KM2";
		australia.Density="3P/KM2";
		System.out.println("CountryName:"+australia.CountryName);
		System.out.println("Population:"+australia.Population);;
		System.out.println("LandArea:"+australia.LandArea);
		System.out.println("Density:"+australia.Density);
		System.out.println("--------------------------");
		States karnataka=new States();
		karnataka.StateName="Karanataka";
		karnataka.StateCapital="Bengalore";
		karnataka.StateLanguage="Kannada";
		karnataka.Pincode=560001;
		System.out.println("StateName:"+karnataka.StateName);
		System.out.println("StateCapital:"+karnataka.StateCapital);
		System.out.println("StateLanguage:"+karnataka.StateLanguage);
		System.out.println("Pincode:"+karnataka.Pincode);
		System.out.println("----------------------------");
		District bellary=new District();
		bellary.DistrictName="BELLARY";
		bellary.GovernmentType="Municipal Corporation";
		bellary.Density="8,600/km2 (22,000/sq mi)";
		bellary.Literacy="79%";
		System.out.println("DistrictName:"+bellary.DistrictName);
		System.out.println("GovernmentType:"+bellary.GovernmentType);
		System.out.println("Density:"+bellary.Density);
		System.out.println("Literacy:"+bellary.Literacy);
		System.out.println("----------------------------");
		Village hp=new Village();
		hp.VillageName="HARAPANAHALLI";
		hp.GovernmentBody="Harapanahalli Town Municipal Council (TMC)";
		hp.Area="6.98 km2 (2.69 sq mi)";
		hp.Density="6,000/km2 (16,000/sq mi)";
		System.out.println("VillageName:"+hp.VillageName);
		System.out.println("GovernmentBody:"+hp.GovernmentBody);
		System.out.println("Area:"+hp.Area);
		System.out.println("Density:"+hp.Density);
		System.out.println("---------------------");
	}

}
