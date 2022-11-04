package com.sgtesting.returnmethod;
class EvenNumber
{
	int[] evenNumber(int num,int num1)
	{
		int count=0;
		for(int i=num;i<=num1;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		int b[]=new int[count];
		int k=0;
		for(int i=num;i<=num1;i++)
		{
			if(i%2==0)
			{
				b[k]=i;
				k++;
			}
		}
		return b;
	}
	
}
public class EvenNumbers {

	public static void main(String[] args) {
		EvenNumber obj=new EvenNumber();
		int b[]=obj.evenNumber(50,80);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}
		
		

	}

}
