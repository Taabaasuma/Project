package com.sgtesting.noargsconstructor;
class Employee
{
	String EMPName;
	int EMPID;
	String Job;
	int  sal;
	Employee()
	{
		EMPName="Smith Allen";
		EMPID=10;
		Job="Analyst";
		sal=8000;
		System.out.println("EMPName:"+EMPName);
		System.out.println("EMPID:"+EMPID);
		System.out.println("Job:"+Job);
		System.out.println("Sal:"+sal);
		System.out.println("-------------------------");
	}
}
class Department
{
	String deptName;
	int deptNo;
	String deptLoc;
	int NoOfEmp;
	Department()
	{
		deptName="ACCOUNTING";
		deptNo=20;
		deptLoc="New York";
		NoOfEmp=30;
		System.out.println("Dept Name:"+deptName);
		System.out.println("DeptNo:"+deptNo);
		System.out.println("Loc:"+deptLoc);
		System.out.println("No Of EMP:"+NoOfEmp);
		System.out.println("----------------------------");
	}
}
class Insurance
{
	int insuranceDeptNo;
	String insurance_provider;
	String insurance_type;
	String Policy_Date;
	Insurance()
	{
		insurance_type="Health";
		insuranceDeptNo=40;
		insurance_provider="BAJAJ INSURANCE";
		Policy_Date="9/FEB/2022";
		System.out.println("insurance_type:"+insurance_type);
		System.out.println("insuranceDeptNo:"+insuranceDeptNo);
		System.out.println("insurance_provider:"+insurance_provider);
		System.out.println("Policy_Date:"+Policy_Date);
		System.out.println("---------------------------");
	}
}

public class MainDemo1 {

	public static void main(String[] args) {

		Employee smith=new Employee();
		Employee empid=new Employee();
		Employee job=new Employee();
		Employee sal=new Employee();
		
		Department accounting=new Department();
		
		Insurance health=new Insurance();
		
	}

}
