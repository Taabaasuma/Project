package com.sgtesting.javatest1assignment;

public class Demo1 {

	public static void main(String[] args) {
		char ch[][]= {{'A','B','C'},{'D','E','F'}};
		for(int i=ch.length-1;i>=0;i--)
		{
			for(int j=ch[i].length-1;j>=0;j--)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}

	}

}
