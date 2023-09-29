package com.cjc.bms.model;

public class Account {
	private int accountNo;
	private String name;
	private long mobileno;
	private long adharNo;
	private String gender;
	private int age;
	
	public void SetAccNo(int accountNo)
	{
		this.accountNo=accountNo;
	}
	public void SetName(String name)
	{
		this.name=name;
	}
	public void SetMobileno(long mobileno)
	{
		this.mobileno=mobileno;
	}
	public void SetAdharNo(long adharNo)
	{
		this.adharNo=adharNo;
	}
	public void Setgender(String gender)
	{
		this.gender=gender;
	}
	public void Setage(int age)
	{
		this.age=age;
	}
	
	public int getAccNo()
	{
		return accountNo;
	}
	public String getName()
	{
		return name;
	}
	public long getMobileno()
	{
		return mobileno;
	}
	public long Adharno()
	{
		return adharNo;
	}
	public String getGender()
	{
		return gender;
	}
	public int getAge()
	{
		return age;
	}
	public void SetBalance(double nextDouble) {
		// TODO Auto-generated method stub
		
	}
	public String getBalance() {
		// TODO Auto-generated method stub
		return null;
	}
	
		
	}

	


