package com.sgtesting.recursion;
class Square
{
	int SqurenNum(int n)
	{
	     if(n==0)
	     {
	    	 return 0;
	     }
		return SqurenNum(n-1)+2*n-1;
	}
}
public class SqureNumber {

	public static void main(String[] args) {
		Square obj=new Square();
		int res=obj.SqurenNum(5);
		System.out.println(res);

	}

}
