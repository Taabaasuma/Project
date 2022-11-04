package com.sgtesting.stringassignment;
class Demo
{
	static void show()
	{
		String s=new String("Bangalore,Mysore");
	    String s1=s.replace("Bangalore,Mysore", "Mysore,Bangalore");
	    System.out.println("Replace Result:"+s1);
	}
}
public class StringAssignment4 {

	public static void main(String[] args) {
	     Demo.show();

	}

}
