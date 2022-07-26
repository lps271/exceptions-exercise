package model.entities;

import model.exceptions.BalanceException;

public class Account {
	private long number;
	private String holder;
	private double balance;
	private double whithdrawLimit;

	public Account(long number, String holder, double balance, double whithdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.whithdrawLimit = whithdrawLimit;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public void deposit(double amount) {

	}

	public void withdraw(double amount) {
		if (balance <= 0) {
			throw new BalanceException("There is no balance in the account");
		} else if (amount > this.whithdrawLimit) {
			throw new BalanceException("Withdraw error: The amount exceeds withdraw limit"); 
		} else if (amount > this.balance) {
			throw new BalanceException("Withdraw error: Not enough balance");
		}
		
		this.balance -= amount;
		System.out.println("New balance: " + this.balance);
	}
	
	
	

}
