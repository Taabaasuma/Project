package com.sgtesting.practice;
abstract class Employeep
{
	abstract void e(String name);
	abstract void s(int id);
}
abstract class Departmentp extends Employeep
{
	abstract void d(String name);
	abstract void d1(int id);
}
class Operationp extends Departmentp
{
	 void e(String name)
	 {
		 System.out.println("EMployee name:"+name);
	 }
	 void s(int id)
	 {
		 System.out.println("EMployee Id:"+id);
	 }
	 void d(String name)
	 {
		 System.out.println("Department Name:"+name);
	 }
	 void d1(int id)
	 {
		 System.out.println("Department Id:"+id);
	 }
}
public class Example7 {

	public static void main(String[] args) {
		Operationp o=new Operationp();
		o.e("Santhosh");
		o.s(12);
		o.d("Manager");
		o.d1(13);

	}

}
