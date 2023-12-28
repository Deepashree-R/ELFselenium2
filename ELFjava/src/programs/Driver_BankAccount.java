package programs;

public class Driver_BankAccount {
public static void main(String[] args) {
	BankAccount b=new BankAccount(50000);
	System.out.println(b.getBalance(1234));
	b.deposit(2000);
	
}
}
