package com.sgtesting.parameterisingconstructor;
class Main 
{
	  int modelYear;
	  String modelName;
	  Main(int Modelyear, String Modelname) 
	{
		modelYear = Modelyear;
		modelName = Modelname;
		System.out.println(modelYear + " " +modelName);
	}
	  
	
}
public class sample {

	public static void main(String[] args) {
		Main o1 = new Main(1969, "Mustang");
		Main o2 = new Main(1970, "Swift");

	}

}
