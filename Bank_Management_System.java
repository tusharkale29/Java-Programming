
package com.braindata.bankmanagement.model;

public class Account 
{
	private int accNo;
	private String name;
	private long mobNo;
	private long adharNo;
	private char gender;
	private int age;
	private double balance;
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	public Long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	


}



package com.braindata.bankmanagement.service;

public interface Rbi {
	
	public void createAccount();
	public void displayAllDetails();
	public void depositeMoney();
	public void withdrawal();
	public void balanceCheck();

}


package com.braindata.bankmanagement.serviceImpl;

import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class Sbi implements Rbi{

	Account a = new Account();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void createAccount() 
	{
		System.out.println("Deposite Amount to creat Account ( minimum 500) ");
		double d = sc.nextDouble();
		if(d>=500)
		{
			a.setBalance(d);
			
		}
		else
		{
			System.out.println("Amount invalid to create account ");
			//1. REENTER ACCOUNT BAL  2. EXIT
		}
		System.out.println("Enter Name: ");
		String s1 = sc.next();
		a.setName(s1);
		System.out.println("Enter Account number: ");
		int x = sc.nextInt();
		a.setAccNo(x);
		System.out.println("Enter Mobile number: ");
		long l = sc.nextLong();
		a.setMobNo(l);
		System.out.println("Enter the Aadhar number: ");
		long l1=sc.nextLong();
		a.setAdharNo(l1);
		System.out.println("Enter Gender: ");
		char c = sc.next().charAt(0);
		a.setGender(c);
		System.out.println("Enter Age: ");
		int x1 =sc.nextInt();
		a.setAge(x1);	
		
	}

	@Override
	public void displayAllDetails() {
		
		System.out.println();
		System.out.println("Details: ");
		System.out.println("Name: "+ a.getName());
		System.out.println("Account No. " +a.getAccNo());
		System.out.println("Mobile No: "+a.getMobNo());
		System.out.println("Aadhar no. : "+a.getAdharNo());
		System.out.println("Gender: "+a.getGender());
		System.out.println("Age: " +a.getAge());
		System.out.println("Balance: " + a.getBalance());
		
	}

	@Override
	public void depositeMoney() {//0==0 
		
		System.out.println("Enter the amount to deposit: ");
		double amt = sc.nextLong();
		
		// double total = a.getBalance()+amt;
		//
		a.setBalance(a.getBalance()+amt);
		System.out.println("Amount Deposited Succefully");
	}

	@Override
	public void withdrawal() 
	{
		System.out.println("Enter Withdrow Amount: ");
		long amt = sc.nextLong();
		
		a.setBalance(a.getBalance()-amt);
		if(a.getBalance()<=500)
		{
			System.out.println("Transcation Faild  (Your account want minimum 500 to active) ");
			a.setBalance(a.getBalance()+amt);
		}
		else
		{
			System.out.println("Transcation Succefull");
		}
	}

	@Override
	public void balanceCheck() 
	{
		//accountno ==accountno 
		System.out.println(a.getBalance());
		// TODO Auto-generated method stub
		
	}
	

}


package com.braindata.bankmanagement.client;

import java.util.Scanner;

import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;

public class Test 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rbi r = new Sbi();
		
		while(true)
		{
		
		System.out.println();
		System.out.println("1. Creat Account");
		System.out.println("2. Show Account Details");
		System.out.println("3. Deposite Amount");
		System.out.println("4. Withdrow Amount");
		System.out.println("5. Check Balance");
		System.out.println("6. Exit");
		System.out.println();
		System.out.println("Enter Your choice: ");
		int ch = sc.nextInt();
		
		switch (ch) 
		{
		case 1:
			r.createAccount();
			break;
			
		case 2:
			r.displayAllDetails();
			break;
			
		case 3:
			r.depositeMoney();
			break;
			
		case 4:
			r.withdrawal();
			break;
			
		case 5:
			r.balanceCheck();
			break;

		default:
			System.out.println("Thank You ");
			System.exit(0);
		}
		}
		
	}

}
