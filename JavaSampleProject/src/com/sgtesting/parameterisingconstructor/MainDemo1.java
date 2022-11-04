package com.sgtesting.parameterisingconstructor;
class Employee
{
	String EMPName;
	int EMPID;
	String Job;
	int  sal;
}
class Department
{
	String deptName;
	int deptNo;
	String deptLoc;
	int NoOfEmp;
}
class Insurance
{
	int insuranceDeptNo;
	String insurance_provider;
	String insurance_type;
	String Policy_Date;
}

public class MainDemo1 {

	public static void main(String[] args) {

		Employee smith=new Employee();
		smith.EMPName="Smith Allen";
		smith.EMPID=10;
		smith.Job="Analyst";
		smith.sal=8000;
		System.out.println("EMPName:"+smith.EMPName);
		System.out.println("EMPID:"+smith.EMPID);
		System.out.println("Job:"+smith.Job);
		System.out.println("Sal:"+smith.sal);
		System.out.println("-------------------------");
		Department accounting=new Department();
		accounting.deptName="ACCOUNTING";
		accounting.deptNo=20;
		accounting.deptLoc="New York";
		accounting.NoOfEmp=30;
		System.out.println("Dept Name:"+accounting.deptName);
		System.out.println("DeptNo:"+accounting.deptNo);
		System.out.println("Loc:"+accounting.deptLoc);
		System.out.println("No Of EMP:"+accounting.NoOfEmp);
		System.out.println("----------------------------");
		Insurance health=new Insurance();
		health.insurance_type="Health";
		health.insuranceDeptNo=40;
		health.insurance_provider="BAJAJ INSURANCE";
		health.Policy_Date="9/FEB/2022";
		System.out.println("insurance_type:"+health.insurance_type);
		System.out.println("insuranceDeptNo:"+health.insuranceDeptNo);
		System.out.println("insurance_provider:"+health.insurance_provider);
		System.out.println("Policy_Date:"+health.Policy_Date);
		System.out.println("---------------------------");
	}

}
