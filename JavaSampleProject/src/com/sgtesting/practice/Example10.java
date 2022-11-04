package com.sgtesting.practice;
class Bank
{
	private int accountno;
	String bankname;
	public int getAccountNo()
	{
		return accountno;
	}
	public void setAccountNo(int accountno)
	{
		this.accountno=accountno;
	}
}
public class Example10 {

	public static void main(String[] args) {
		Bank o=new Bank();
		o.setAccountNo(145263513);
		int accno=o.getAccountNo();
		o.bankname="Syndycate Bank";
		System.out.println(o.bankname);
		System.out.println(accno);

	}

}
