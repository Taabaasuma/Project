package com.sgtesting.inheritence;
class Teacher1
{
	Teacher1(String Subname,int Grade,String Pname)
	{
		System.out.println("Subject name:"+Subname);
		System.out.println("Grade Number:"+Grade);
		System.out.println("Principal Name:"+Pname);
	}
}
class Student1 extends Teacher1
{
	Student1(String N,int G,String pN)
	{
		super(N,G,pN);
	}
}
class Principal1 extends Student1
{
	Principal1(String N,int G,String pN)
	{
		super(N,G,pN);
	}
}
public class MultilevelInheritenceSuperclass {

	public static void main(String[] args) {
		Principal1 o1=new Principal1("Physics",3,"Santhosh");
		System.out.println("------------------------------------");
		Principal1 o2=new Principal1("Chemistry",2,"Santhosh");

	}

}
