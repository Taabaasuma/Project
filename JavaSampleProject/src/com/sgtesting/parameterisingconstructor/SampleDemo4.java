package com.sgtesting.parameterisingconstructor;
class DomesticAnimals1
{
	String AnimalName;
	String Vision;
	String Kingdom;
	String Order;
	DomesticAnimals1(String aname,String vsn,String kgdm,String odr)
	{
		AnimalName=aname;
		Vision=vsn;
		Kingdom=kgdm;
		Order=odr;
		System.out.println("AnimalName:"+AnimalName);
		System.out.println("Vision:"+Vision);
		System.out.println("Kingdom:"+Kingdom);
		System.out.println("Order:"+Order);
		System.out.println("---------------------");
	}
}
class Vegitables1
{
	String VegName;
	String Benifits;
	String Nutrition;
	String Vitamin;
	Vegitables1(String vname,String bnft,String ntn,String vtm)
	{
		VegName=vname;
		Benifits=bnft;
		Nutrition=ntn;
		Vitamin=vtm;
		System.out.println("VegName:"+VegName);
		System.out.println("Benifits:"+Benifits);
		System.out.println("Nutrition:"+Nutrition);
		System.out.println("Vitamin:"+Vitamin);
		System.out.println("-----------------------------");
	}
}
class Fruits1
{
	String FruitName;
	String Nuitrision;
	String Toxicity;
	String Culture;
	Fruits1(String fname,String nutn,String txty,String culr)
	{
		FruitName=fname;
		Nuitrision=nutn;
		Toxicity=txty;
		Culture=culr;
		System.out.println("FruitName:"+FruitName);
		System.out.println("Nuitrision:"+Nuitrision);
		System.out.println("Toxicity:"+Toxicity);
		System.out.println("Culture:"+Culture);
		System.out.println("------------------------------");
	}
}
class Flower1
{
	String FlowerName;
	String Origin;
	String Gender;
	String Pronunciation;
	Flower1(String fname,String ogn,String Gdr,String pnctn)
	{
		FlowerName=fname;
		Origin=ogn;
		Gender=Gdr;
		Pronunciation=pnctn;
		System.out.println("FlowerName:"+FlowerName);
		System.out.println("Origin:"+Origin);
		System.out.println("Gender:"+Gender);
		System.out.println("Pronunciation:"+Pronunciation);
		System.out.println("----------------------------------");
	}
}
public class SampleDemo4 {

	public static void main(String[] args) {

		DomesticAnimals1 cat=new DomesticAnimals1("CAT","Night vision","Animal","Carnivora");
		DomesticAnimals1 dog=new DomesticAnimals1("DOG","Day and Night vision","Animal","Carnivora");
		
		Vegitables1 carrot=new Vegitables1("CARROT","It is good for eyes","25 calories,6 grams of carbohydrates,2 grams of fiber,3 grams of sugar","73% of VitaminA,9% of VitaminK,5% VitaminC");
		Vegitables1 cabbage=new Vegitables1("Cabbage","It is Good for Health","92% water, 6% carbohydrates, 1% protein","44% Vitamin C,72% Vitamin K");
		
		Fruits1 mango=new Fruits1("MANGO","84% water,15% carbohydrates,1% protein","dermatitis and anaphylaxis","National fruit of India");
		Fruits1 orange=new Fruits1("Orange","84% water,15% carbohydrate,1% protein","anaphylaxis","It ia is a fruit");
		
		Flower1 jasmin=new Flower1("JASMIN","fragrant flower","Jasmine is commonly used as a girl name","jas-mine");
		Flower1 sunflower=new Flower1("SunFlower","good flower","It ia is flower","sun-Flower");
		
	}

}
