package com.sgtesting.returnmethod;
class Prime
{
	boolean verifyPrime(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag++;
				break;
			}
		}
		if(flag==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class ReturnPrime {

	public static void main(String[] args) {
		Prime o=new Prime();
		for(int j=90;j>=20;j--)
		{
			if(o.verifyPrime(j)==true)
			{
				System.out.println(j);
			}
		}

	}

}
