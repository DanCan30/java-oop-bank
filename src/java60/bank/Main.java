package java60.bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert your full name to create a new account: ");
		String ownerName = sc.nextLine();
		
		Conto conto = new Conto(ownerName);
		
		System.out.println("Account code: " + conto.getBankAccount()
		+ "\nWelcome " + conto.getOwnerName() + ", your currency is " + conto.getCurrency() + "€." );
		
		System.out.print("Add some funds to your account: ");
		int moneyToAdd = sc.nextInt();
		
		conto.addMoney(moneyToAdd);
		System.out.println(conto.getOwnerName() + ", \nYour actual currency is: " + conto.getCurrency() + "€");
		
		System.out.println("Withdraw: ");
		int moneyToWithdraw = sc.nextInt();
		
		String withdrawMessage = conto.getMoney(moneyToWithdraw);
		
		System.out.println(withdrawMessage);
		
		sc.close();
	}
}
