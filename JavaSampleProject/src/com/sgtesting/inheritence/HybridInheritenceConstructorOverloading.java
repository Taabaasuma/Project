package com.sgtesting.inheritence;
class Student11
{
	Student11(String Sname)
	{
		System.out.println("Student1 name:"+Sname);
	}
	Student11(int Rollno)
	{
		System.out.println("Student ROllno:"+Rollno);
	}
	Student11(String Sname,int Rollno)
	{
		System.out.println("Student name:"+Sname+" Student RollNo:"+Rollno);
	}
}
class Student12 extends Student11
{
	Student12(String SN)
	{
		super(SN);
	}
	Student12(int RN)
	{
		super(RN);
	}
	Student12(String SN,int RN)
	{
		super(SN,RN);
	}
}
class Student13 extends Student11
{
	Student13(String sn)
	{
		super(sn);
	}
	Student13(int rn)
	{
		super(rn);
	}
	Student13(String sn,int rn)
	{
		super(sn,rn);
	}
}
class Student14 extends Student13
{
	Student14(String s)
	{
		super(s);
	}
	Student14(int r)
	{
		super(r);
	}
	Student14(String s,int r)
	{
		super(s,r);
	}
}
public class HybridInheritenceConstructorOverloading {

	public static void main(String[] args) {
		Student12 o=new Student12("Santhosh");
		Student12 o1=new Student12(12);
		
		Student14 o2=new Student14(13);
		Student14 o3=new Student14("Arun",14);
		
		

	}

}
