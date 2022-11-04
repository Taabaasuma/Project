package com.sgtesting.noargsconstructor;
class TwoWheeler
{
	String ModelName;
	int Price;
	String Brand;
	String Material;
	TwoWheeler()
	{
		ModelName="Steel Kids Bicycle";
		Price=7999;
		Brand="Edge";
		Material="Steel";
		System.out.println("ModelName:"+ModelName);
		System.out.println("Price:"+Price);
		System.out.println("Brand:"+Brand);
		System.out.println("Material:"+Material);
		System.out.println("------------------------");
	}
}
class FoureWheeler
{
	String ModelNameOrNumber;
	String MinimumOrderQuantity;
	String Brand;
	String Color;
	FoureWheeler()
	{
		ModelNameOrNumber="Hd Screen";
		MinimumOrderQuantity="1 Piece";
		Brand="Hawk";
		Color="Black";
		System.out.println("Model Name Or Number:"+ModelNameOrNumber);
		System.out.println("Minimum Order Quantity:"+MinimumOrderQuantity);
		System.out.println("Brand:"+Brand);
		System.out.println("Color:"+Color);
		System.out.println("----------------------------");
	}
}
class HeavyVehicle
{
	String ModelName;
	String OperatingWeight;
	String EngineModel;
	String Displacement;
	HeavyVehicle()
	{
		ModelName="834K Wheel Dozer";
		OperatingWeight="47750 kg";
		EngineModel="Cat C18";
		Displacement="18.1 L";
		System.out.println("ModelName:"+ModelName);
		System.out.println("Operating Weight:"+OperatingWeight);
		System.out.println("EngineModel:"+EngineModel);
		System.out.println("Displacement:"+Displacement);
		System.out.println("------------------------------");
	}
}
public class MainDemo3 {

	public static void main(String[] args) {

		TwoWheeler bicycle=new TwoWheeler();
		
		FoureWheeler car=new FoureWheeler();
		
		HeavyVehicle bulldozer=new HeavyVehicle();
		
	}

}
