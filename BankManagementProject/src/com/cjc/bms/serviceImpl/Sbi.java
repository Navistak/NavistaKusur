package com.cjc.bms.serviceImpl;
import java.util.Scanner;

import com.cjc.bms.model.Account;
import com.cjc.bms.service.Rbi;

public class Sbi implements Rbi
{
	Account bank=new Account();
	
	Scanner sc=new Scanner(System.in);
	double balance;
public void createAccount()
{
		System.out.println("create Account:");
		System.out.println("Enter Account number:");
		bank.SetAccNo(sc.nextInt());
		
		System.out.println("Enter name:");
		bank.SetName(sc.next());
		
		System.out.println("Enter mobileNo:");
		bank.SetMobileno(sc.nextLong());
		
		System.out.println("Enter adharNo:");
		bank.SetAdharNo(sc.nextLong());
		
		System.out.println("Enter age:");
		bank.Setage(sc.nextInt());
	
		System.out.println("Enter Account Holder Bank balance:");
		bank.SetBalance(sc.nextDouble());
}	
	
public void DisplayAllDetails()
{
	System.out.println("Display all details");
	System.out.println("Account no: "+bank.getAccNo());
	System.out.println("Account Holder name: "+bank.getName());
	System.out.println("Mobile no: "+bank.getMobileno());
	System.out.println("Age: "+bank.getAge());
	System.out.println("Account Holder Bank balance: "+bank.getBalance());
}


public void depositeMoney() {
	System.out.println("depositMoney");
	System.out.println("Enter value for deposit");
	double d=sc.nextDouble();
	balance=balance+d;
	bank.SetBalance(balance);
	System.out.println("Account balance="+bank.getBalance());
}
	

public void withrowalMoney() {
	System.out.println("withrowal Money");
	double d=sc.nextDouble();
	balance=balance-d;
	bank.SetBalance(balance);
	System.out.println("Account balance="+bank.getBalance());
}
	
public void balanceCheck()
{
	System.out.println("Balance check");
	System.out.println("Balance is"+bank.getBalance());
}
}
