package application;

import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw Limit: ");
			double limit = sc.nextDouble();

			Account account = new Account(number, holder, balance, limit);

			System.out.print("Enter amount for withdraw: ");
			double withdraw = sc.nextDouble();
			account.withdraw(withdraw);

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		sc.close();

	}

}
