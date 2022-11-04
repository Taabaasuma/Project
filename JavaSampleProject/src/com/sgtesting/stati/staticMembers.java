package com.sgtesting.stati;
/*
  Static membrs are directly accessible within the body of static method/block
 */
public class staticMembers {
	static String firstname;
	static int age;

	public static void main(String[] args) {
		firstname="Santhosh";
		age=20;
		System.out.println("Firstname:"+firstname+" Age:"+age);

	}

}
