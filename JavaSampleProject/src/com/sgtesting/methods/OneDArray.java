package com.sgtesting.methods;
class Calculation20
{
	void displayElements()
	{
		int a[]= {10,20,30,40,50,60};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	int[] getElements()
	{
		int a[]= {10,20,30,40,50,60};
		return a;
	}
}
public class OneDArray {

	public static void main(String[] args) {
		Calculation20 o=new Calculation20();
		o.displayElements();
		System.out.println("+++++++++++++++++");
		int b[]=o.getElements();
		System.out.println("Read Reverse Order");
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.println(b[i]+" ");
		}
		int c[]=o.getElements();
		System.out.println("Read Second half of Elements");
		for(int i=c.length/2;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}
		int d[]=o.getElements();
		System.out.println("Read the First Half of Elements");
		for(int i=0;i<d.length/2;i++)
		{
			System.out.println(d[i]+" ");
		}
	}

}
