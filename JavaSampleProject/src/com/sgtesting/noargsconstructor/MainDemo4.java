package com.sgtesting.noargsconstructor;

class DomesticAnimals
{
	String AnimalName;
	String Vision;
	String Kingdom;
	String Order;
	DomesticAnimals()
	{
		AnimalName="CAT";
		Vision="Night vision";
		Kingdom="Animal";
		Order="Carnivora";
		System.out.println("AnimalName:"+AnimalName);
		System.out.println("Vision:"+Vision);
		System.out.println("Kingdom:"+Kingdom);
		System.out.println("Order:"+Order);
		System.out.println("---------------------");
	}
}
class Vegitables
{
	String VegName;
	String Benifits;
	String Nutrition;
	String Vitamin;
	Vegitables()
	{
		VegName="CARROT";
		Benifits="It is good for eyes.";
		Nutrition="25 calories,6 grams of carbohydrates,2 grams of fiber,3 grams of sugar";
		Vitamin="73% of VitaminA,9% of VitaminK,5% VitaminC";
		System.out.println("VegName:"+VegName);
		System.out.println("Benifits:"+Benifits);
		System.out.println("Nutrition:"+Nutrition);
		System.out.println("Vitamin:"+Vitamin);
		System.out.println("-----------------------------");
	}
}
class Fruits
{
	String FruitName;
	String Nuitrision;
	String Toxicity;
	String Culture;
	Fruits()
	{
		FruitName="MANGO";
		Nuitrision="84% water,15% carbohydrates,1% protein";
		Toxicity="dermatitis and anaphylaxis";
		Culture="National fruit of India";
		System.out.println("FruitName:"+FruitName);
		System.out.println("Nuitrision:"+Nuitrision);
		System.out.println("Toxicity:"+Toxicity);
		System.out.println("Culture:"+Culture);
		System.out.println("------------------------------");
	}
}
class Flower
{
	String FlowerName;
	String Origin;
	String Gender;
	String Pronunciation;
	Flower()
	{
		FlowerName="JASMIN";
		Origin="fragrant flower";
		Gender="Jasmine is commonly used as a girl name";
		Pronunciation="jas-mine";
		System.out.println("FlowerName:"+FlowerName);
		System.out.println("Origin:"+Origin);
		System.out.println("Gender:"+Gender);
		System.out.println("Pronunciation:"+Pronunciation);
		System.out.println("----------------------------------");
	}
}
public class MainDemo4 {

	public static void main(String[] args) {

		DomesticAnimals cat=new DomesticAnimals();
		
		Vegitables carrot=new Vegitables();
		
		Fruits mango=new Fruits();
		
		Flower jasmin=new Flower();
		
	}

}
