package f.objeck.ex2;

public class Run {
	public static void main(String[] args) {
		//BankAccount ref1 = new BankAccount();
		//BankAccount ref2 =ref1;
		
		
		//System.out.println(ref1.deposit(3000));
		//ref2.deposit(2000);
		
		
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = new BankAccount();
		
		ref1.deposit(10000);
		ref1.withdraw(2000);
		
		
		ref2.checkMyBalance(ref1);
	}

}
