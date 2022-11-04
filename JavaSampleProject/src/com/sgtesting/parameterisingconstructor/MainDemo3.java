package com.sgtesting.parameterisingconstructor;
class TwoWheeler
{
	String ModelName;
	int Price;
	String Brand;
	String Material;
}
class FoureWheeler
{
	String ModelNameOrNumber;
	String MinimumOrderQuantity;
	String Brand;
	String Color;
}
class HeavyVehicle
{
	String ModelName;
	String OperatingWeight;
	String EngineModel;
	String Displacement;
}
public class MainDemo3 {

	public static void main(String[] args) {

		TwoWheeler bicycle=new TwoWheeler();
		bicycle.ModelName="Steel Kids Bicycle";
		bicycle.Price=7999;
		bicycle.Brand="Edge";
		bicycle.Material="Steel";
		System.out.println("ModelName:"+bicycle.ModelName);
		System.out.println("Price:"+bicycle.Price);
		System.out.println("Brand:"+bicycle.Brand);
		System.out.println("Material:"+bicycle.Material);
		System.out.println("------------------------");
		FoureWheeler car=new FoureWheeler();
		car.ModelNameOrNumber="Hd Screen";
		car.MinimumOrderQuantity="1 Piece";
		car.Brand="Hawk";
		car.Color="Black";
		System.out.println("Model Name Or Number:"+car.ModelNameOrNumber);
		System.out.println("Minimum Order Quantity:"+car.MinimumOrderQuantity);
		System.out.println("Brand:"+car.Brand);
		System.out.println("Color:"+car.Color);
		System.out.println("----------------------------");
		HeavyVehicle bulldozer=new HeavyVehicle();
		bulldozer.ModelName="834K Wheel Dozer";
		bulldozer.OperatingWeight="47750 kg";
		bulldozer.EngineModel="Cat C18";
		bulldozer.Displacement="18.1 L";
		System.out.println("ModelName:"+bulldozer.ModelName);
		System.out.println("Operating Weight:"+bulldozer.OperatingWeight);
		System.out.println("EngineModel:"+bulldozer.EngineModel);
		System.out.println("Displacement:"+bulldozer.Displacement);
		System.out.println("------------------------------");
	}

}
