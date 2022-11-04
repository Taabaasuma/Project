package com.sgtesting.encapsulation;
class Human
{
	String firstName;
	int age;
}
class Birds
{
	String FeatherColor;
	int noofWings;
}
class DomesticAnimals
{
	String quantityofmilkprovides;
	String breedName;
}
public class MainDemo {

	public static void main(String[] args) {
		Human santu=new Human();
		santu.firstName="Santhosh";
		santu.age=19;
		System.out.println("First Name:"+santu.firstName);
		System.out.println("Age:"+santu.age);
		System.out.println("-----------------");
		Birds sparrow=new Birds();
		sparrow.FeatherColor="Grey color";
		sparrow.noofWings=2;
		System.out.println("FeatherColor:"+sparrow.FeatherColor);
		System.out.println("NoofWings:"+sparrow.noofWings);
		System.out.println("-------------------");
		DomesticAnimals cow=new DomesticAnimals();
		cow.quantityofmilkprovides="10 liters";
		cow.breedName="jersey";
		System.out.println("quantity of milk provides:"+cow.quantityofmilkprovides);
		System.out.println("BreedName:"+cow.breedName);
	}

}
