package com.sgtesting.inheritence;
class Teacher
{
	void teaching()
	{
		System.out.println("Teaching Subjects");
	}
}
class Student extends Teacher
{
	void Listen()
	{
		System.out.println("Listening");
		System.out.println("------------------------------");
	}
}
class Principal extends Teacher
{
	void evaluate()
	{
		System.out.println("Evaluating");
	}
}
public class HeiraricalInheritence {

	public static void main(String[] args) {
		Student s=new Student();
		s.teaching();
		s.Listen();
		
		Principal p=new Principal();
		p.teaching();
		p.evaluate();

	}

}
