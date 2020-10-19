package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.whitdraw(200);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.whitdraw(200.0);
		
		/*
		 * ao dizer @Override no método whitdraw do SavingsAccount
		 * ele irá considerar que o método a ser executado é o da própria SavingsAccount
		 * e não o da classe Account, que desconta + 5.0
		 */
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.whitdraw(200.0);
		System.out.println(acc3.getBalance());
		
		
	}

}
