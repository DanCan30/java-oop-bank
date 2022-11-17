package java60.bank;

import java.util.Random;

public class Conto {

	private int bankAccount;
	public String ownerName;
	private int currency = 0;
	
	Random rand;
	
	public Conto(String ownerName) {
		rand = new Random();
		this.bankAccount = rand.nextInt(1000, 10000);
		this.ownerName = ownerName;
	}
	
	//Getters and setters
	
	public int getBankAccount() {
		return bankAccount;
	}
	
	public void setBankAccount(int bankAccount) {
		 this.bankAccount = bankAccount;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getCurrency() {
		return currency;
	}
	
	//--------------------------------
	
	public String addMoney(int moneyToAdd) {
		this.currency += moneyToAdd;
		return moneyToAdd + "€ have been successfully added to your account.";
	}
	
	public String getMoney(int moneyToGet) {
		
		if(this.currency > moneyToGet) {
			
			this.currency -= moneyToGet;
			return moneyToGet + "€ have been successfully withdrawn from your account. You have " 
					+ currency + "€ left on your account.";
		} else {
			
			return "You tried to withdraw " + moneyToGet + "€, but do not have enough currency. "
			+ currency + "€ left on your account.";
		}
	}
	
	@Override
	public String toString() {
		return "Account code: " + getBankAccount() + 
				"\nOwner: " + getOwnerName() + 
				"\nYour currency: " + getCurrency() + "€";
	}

}
