package com.sgtesting.methods;
class Calculation4
{
	void transpose(int a[][])
	{ 
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[j][i]+" ");  
			}
			System.out.println();
		}
	}
}
public class TransposeMatrix {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		Calculation4 o1=new Calculation4();
		o1.transpose(a);
	}

}
