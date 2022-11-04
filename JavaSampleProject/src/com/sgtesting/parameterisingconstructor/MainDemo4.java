package com.sgtesting.parameterisingconstructor;

class DomesticAnimals
{
	String AnimalName;
	String Vision;
	String Kingdom;
	String Order;
}
class Vegitables
{
	String VegName;
	String Benifits;
	String Nutrition;
	String Vitamin;
}
class Fruits
{
	String FruitName;
	String Nuitrision;
	String Toxicity;
	String Culture;
}
class Flower
{
	String FlowerName;
	String Origin;
	String Gender;
	String Pronunciation;
}
public class MainDemo4 {

	public static void main(String[] args) {

		DomesticAnimals cat=new DomesticAnimals();
		cat.AnimalName="CAT";
		cat.Vision="Night vision";
		cat.Kingdom="Animal";
		cat.Order="Carnivora";
		System.out.println("AnimalName:"+cat.AnimalName);
		System.out.println("Vision:"+cat.Vision);
		System.out.println("Kingdom:"+cat.Kingdom);
		System.out.println("Order:"+cat.Order);
		System.out.println("---------------------");
		Vegitables carrot=new Vegitables();
		carrot.VegName="CARROT";
		carrot.Benifits="It is good for eyes.";
		carrot.Nutrition="25 calories,6 grams of carbohydrates,2 grams of fiber,3 grams of sugar";
		carrot.Vitamin="73% of VitaminA,9% of VitaminK,5% VitaminC";
		System.out.println("VegName:"+carrot.VegName);
		System.out.println("Benifits:"+carrot.Benifits);
		System.out.println("Nutrition:"+carrot.Nutrition);
		System.out.println("Vitamin:"+carrot.Vitamin);
		System.out.println("-----------------------------");
		Fruits mango=new Fruits();
		mango.FruitName="MANGO";
		mango.Nuitrision="84% water,15% carbohydrates,1% protein";
		mango.Toxicity="dermatitis and anaphylaxis";
		mango.Culture="National fruit of India";
		System.out.println("FruitName:"+mango.FruitName);
		System.out.println("Nuitrision:"+mango.Nuitrision);
		System.out.println("Toxicity:"+mango.Toxicity);
		System.out.println("Culture:"+mango.Culture);
		System.out.println("------------------------------");
		Flower jasmin=new Flower();
		jasmin.FlowerName="JASMIN";
		jasmin.Origin="fragrant flower";
		jasmin.Gender="Jasmine is commonly used as a girl name";
		jasmin.Pronunciation="jas-mine";
		System.out.println("FlowerName:"+jasmin.FlowerName);
		System.out.println("Origin:"+jasmin.Origin);
		System.out.println("Gender:"+jasmin.Gender);
		System.out.println("Pronunciation:"+jasmin.Pronunciation);
		System.out.println("----------------------------------");
	}

}
