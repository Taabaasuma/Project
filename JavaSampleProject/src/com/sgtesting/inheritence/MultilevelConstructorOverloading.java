package com.sgtesting.inheritence;
class Teacher2
{
	Teacher2(String Subname)
	{
		System.out.println("Subject Name:"+Subname);
	}
	Teacher2(String Subname,int Grade)
	{
		System.out.println("Subject Name:"+Subname+" Grade Number:"+Grade);
	}
	Teacher2(String Subname,int Grade,String Pname)
	{
		System.out.println("Subject Name:"+Subname+" Grade Number:"+Grade+" Principal Name:"+Pname);
	}
}
class Student2 extends Teacher2
{
	Student2(String subname)
	{
		super(subname);
	}
	Student2(String subname,int grade)
	{
		super(subname,grade);
	}
	Student2(String subname,int grade,String pN)
	{
		super(subname,grade,pN);
	}
}
class Principal2 extends Student2
{
	 Principal2(String sname)
	{
		super(sname);
	}
	 Principal2(String sname,int gr)
	{
		super(sname,gr);
	}
	 Principal2(String sname,int gr,String p)
	{
		super(sname,gr,p);
	}
}
public class MultilevelConstructorOverloading {

	public static void main(String[] args) {
		Principal2 o=new Principal2("Physics",1,"Arun Kumar");
		Principal2 o1=new Principal2("Chemistry",6);
		Principal2 o2=new Principal2("Biology");

	}

}
