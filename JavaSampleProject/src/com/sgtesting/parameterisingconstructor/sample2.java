package com.sgtesting.parameterisingconstructor;
class Demo1
{
	  int x;
      Demo1(int y) 
      {
    	  x =y;
    	  System.out.println("x:"+y);
      }
	    
	  
}
public class sample2 {

	public static void main(String[] args) {
		Demo1 o1= new Demo1(5);
		Demo1 o2= new Demo1(10);

	}

}
