package com.sgtesting.array;

public class Demo9 {

	public static void main(String[] args) {
		double d[]= {1.25,3.25,6.25};
		double a[]=new double[d.length];
		for(int i=0;i<d.length;i++)
		{
			a[i]=d[i];
		}
		System.out.println("Original double array");
		for(int i=0;i<d.length;i++)
		{
			System.out.print(d[i]+" ");
		}
		System.out.println();
		System.out.println("new double array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	    //new double array in reverse order
		System.out.println("double array in reverse order");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		

	}

}
