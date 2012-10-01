package Account;
/**
 * 
 * @Brief description: This is a homework project for CPE640
 * 						it is implement of account
 * 
 * @created by: Lifeng Yin
 * 
 */

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Account {
	
	/**
	 * @data member
	 */
	private int id;
	private double balance;
	private static double annualInterestRate = 0;
	private Date dateCreated;

	/**
	 * @member methods
	 */
	public Account()
	{
		this.id = 0;
		this.balance = 0;
		this.dateCreated = new Date();
	}

	public Account(int id, double balance)
	{
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getId()
	{
		return this.id;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public double getBalance()
	{
		return this.balance;
	}

	public void setAnnualInterestRate(double annualInterestRate)
	{
		Account.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated()
	{
		return this.dateCreated;
	}

	public double getMonthlyInterestRate()
	{
		return Account.annualInterestRate/12;
	}

	public double withdraw(double withdrawAmount)
	{
		this.balance -= withdrawAmount;
		return this.balance;
	}

	public double deposit(double depositAmount)
	{
		this.balance += depositAmount;
		return this.balance;
	}
	
	public static void main(String[] args) {
		
		// some testing method
		Account accountObj = new Account(1122, 20000);
		
		accountObj.setAnnualInterestRate(0.045);
		accountObj.withdraw(2500);
		double balance = accountObj.deposit(3000);
		
		//print these details of this account
		System.out.println("The balance is $" + balance);
		System.out.println("The monthly interest is " + accountObj.getMonthlyInterestRate());
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("This account was created on " + dateFormat.format(accountObj.getDateCreated()));
	}
}
