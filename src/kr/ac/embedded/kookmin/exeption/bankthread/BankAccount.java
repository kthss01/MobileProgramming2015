package kr.ac.embedded.kookmin.exeption.bankthread;

public class BankAccount {
	private int balance = 100;
	
	public int getBalance() {
		return balance;
	}
	
	public void withDraw(int amount) {
		balance -= amount;
	}
}
