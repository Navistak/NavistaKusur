package com.cjc.bms.client;
import java.util.Scanner;
import com.cjc.bms.service.Rbi;
import com.cjc.bms.serviceImpl.Sbi;
	

	
public class Test {

		public static void main(String[] args) 
		{
			
			Rbi bank1=new Sbi();
			
			
					Rbi bank=new Sbi();
					while(true)
					{
					
					
			System.out.println("1 createAccount");
			System.out.println("2 viewAccountDetails\n"
				+"3 Deposit\n"
					+"4 withrawalMoney\n"
					+ "5 check Account Balance\n"
					+"6 Exit\n");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice");
			int i=sc.nextInt();
		
					if(i==1)
					{
					bank.createAccount();
					}
					else if(i==2)
					{
					bank.DisplayAllDetails();
					}
					else if(i==3)
					{
					bank.depositeMoney();
					}
					else if(i==4)
					{
					bank.withrowalMoney();
					}
					else if(i==5)
					bank.balanceCheck();
					
					else if(i==6)
					{
						break;
					}
					else
					{
					
						System.out.println("wrong choice");
					}
					
					
			
		
						}
			}
	}


	
