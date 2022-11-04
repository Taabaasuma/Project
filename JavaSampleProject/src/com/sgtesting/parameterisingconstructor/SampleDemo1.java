package com.sgtesting.parameterisingconstructor;
class Employee1
{
	String EMPName;
	int EMPID;
	String Job;
	int  sal;
	Employee1(String empn,int empid,String jb,int sl)
	{
		EMPName=empn;
		EMPID=empid;
		Job=jb;
		sal=sl;
		System.out.println("EMPNAME:"+EMPName);
		System.out.println("EMPID:"+EMPID);
		System.out.println("Job:"+Job);
		System.out.println("sal:"+sal);
		System.out.println("-------------------------");
	}
}
class Department1
{
	String deptName;
	int deptNo;
	String deptLoc;
	int NoOfEmp;
	Department1(String deptn,int deptno,String deptl,int noemp)
	{
		deptName=deptn;
		deptNo=deptno;
		deptLoc=deptl;
		NoOfEmp=noemp;
		System.out.println("Dept Name:"+deptName);
		System.out.println("DeptNo:"+deptNo);
		System.out.println("Loc:"+deptLoc);
		System.out.println("No Of EMP:"+NoOfEmp);
		System.out.println("----------------------------");
	}
}
class Insurance1
{
	String insurance_type;
	int insuranceDeptNo;
	String insurance_provider;
	String Policy_Date;
	Insurance1(String insty,int insdno,String inspr,String pod)
	{
		insurance_type=insty;
		insuranceDeptNo=insdno;
		insurance_provider=inspr;
		Policy_Date=pod;
		System.out.println("insurance_type:"+insurance_type);
		System.out.println("insuranceDeptNo:"+insuranceDeptNo);
		System.out.println("insurance_provider:"+insurance_provider);
		System.out.println("Policy_Date:"+Policy_Date);
		System.out.println("---------------------------");
	}
	
}
public class SampleDemo1 {

	public static void main(String[] args) {
		Employee1 smith=new Employee1("Smith Allen",10,"Analyst",8000);
		Employee1 ford=new Employee1("Ford King",20,"Manager",6000);
		
		Department1 accounting=new Department1("ACCOUNTING",20,"New York",30);
		Department1 operation=new Department1("OPERATION",40,"USA",60);
		
		Insurance1 health=new Insurance1("Health",40,"BAJAJ INSURANCE","9/FEB/2022");
		Insurance1 vehicle=new Insurance1("VEHICLE",50,"LOC INSURANCE","12/MAR/2022");
		

	}

}
