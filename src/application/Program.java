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
		 * ao dizer @Override no m�todo whitdraw do SavingsAccount
		 * ele ir� considerar que o m�todo a ser executado � o da pr�pria SavingsAccount
		 * e n�o o da classe Account, que desconta + 5.0
		 */
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.whitdraw(200.0);
		System.out.println(acc3.getBalance());
		
		
	}

}
