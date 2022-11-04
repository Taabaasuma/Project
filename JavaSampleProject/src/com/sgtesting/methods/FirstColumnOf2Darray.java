package com.sgtesting.methods;
class Array
{
	void twoDarray(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(j==0)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
public class FirstColumnOf2Darray {

	public static void main(String[] args) {
		int arr[][]= {{10,20},{40,50}};
		Array o1=new Array();
		o1.twoDarray(arr);

	}

}
