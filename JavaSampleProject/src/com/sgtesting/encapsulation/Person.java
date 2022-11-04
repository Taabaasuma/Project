package com.sgtesting.encapsulation;

public class Person {
	String firstName;
	int age;

	public static void main(String[] args) {
		Person santu=new Person();
		santu.firstName="Santhosh";
		santu.age=19;
		System.out.println("First Name:"+santu.firstName);
		System.out.println("Age:"+santu.age);
		System.out.println("+++++++++++");
		Person virat=new Person();
		virat.firstName="Virat Kohli";
		virat.age=33;
		System.out.println("First Name:"+virat.firstName);
		System.out.println("Age:"+virat.age);



	}

}
