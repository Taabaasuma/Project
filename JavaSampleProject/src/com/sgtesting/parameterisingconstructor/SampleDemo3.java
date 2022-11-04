package com.sgtesting.parameterisingconstructor;
class TwoWheeler1
{
	String ModelName;
	int Price;
	String Brand;
	String Material;
	TwoWheeler1(String mname,int pr,String brd,String mtr)
	{
		ModelName=mname;
		Price=pr;
		Brand=brd;
		Material=mtr;
		System.out.println("ModelName:"+ModelName);
		System.out.println("Price:"+Price);
		System.out.println("Brand:"+Brand);
		System.out.println("Material:"+Material);
		System.out.println("------------------------");
	}
}
class FoureWheeler1
{
	String ModelNameOrNumber;
	String MinimumOrderQuantity;
	String Brand;
	String Color;
	FoureWheeler1(String mdnon,String moq,String br,String cr)
	{
		ModelNameOrNumber=mdnon;
		MinimumOrderQuantity=moq;
		Brand=br;
		Color=cr;
		System.out.println("Model Name Or Number:"+ModelNameOrNumber);
		System.out.println("Minimum Order Quantity:"+MinimumOrderQuantity);
		System.out.println("Brand:"+Brand);
		System.out.println("Color:"+Color);
		System.out.println("----------------------------");
	}
}
class HeavyVehicle1
{
	String ModelName;
	String OperatingWeight;
	String EngineModel;
	String Displacement;
	HeavyVehicle1(String mnm,String opw,String egm,String dmt)
	{
		ModelName=mnm;
		OperatingWeight=opw;
		EngineModel=egm;
		Displacement=dmt;
		System.out.println("ModelName:"+ModelName);
		System.out.println("Operating Weight:"+OperatingWeight);
		System.out.println("EngineModel:"+EngineModel);
		System.out.println("Displacement:"+Displacement);
		System.out.println("------------------------------");
	}
}
public class SampleDemo3 {

	public static void main(String[] args) {
		
		TwoWheeler1 bicycle=new TwoWheeler1("Steel Kids Bicycle",7999,"Edge","Steel");
		TwoWheeler1 bike=new TwoWheeler1("HONDA",90000,"Edge","Steel");
		
		FoureWheeler1 car=new FoureWheeler1("Hd Screen","1 Piece","Hawk","Black");
		FoureWheeler1 car1=new FoureWheeler1("Hd Screen","1 Piece","Swift","Red");
		
		HeavyVehicle1 bulldozer=new HeavyVehicle1("834K Wheel Dozer","47750 kg","Cat C18","18.1 L");
		HeavyVehicle1 bulldozer1=new HeavyVehicle1("836k Wheel Dozer","56640 kg","Cat C19","20.1L");

	}

}
