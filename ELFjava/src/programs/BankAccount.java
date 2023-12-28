package programs;

public class BankAccount {
//private states
	private int pin=1234;
	private double balance;
	BankAccount(double balance)
	{
		this.balance=balance;
	}
	//getter with validation
	public String getBalance(int pin)
	{
		//validation
		if(this.pin==pin)
		{
			return "Balance:"+balance;
		}
		else
		{
			return "Invalid pin, balance cannot be checked";
		}
	}
	//setters with validation (DEPOSIT)
	public void deposit(int depositAmt)
	{
		//validation
		if(depositAmt>0)
		{
			this.balance=balance+depositAmt;
			System.out.println("deposited successfully");
		}
		else
		{
			System.out.println("deposit ammount should be greater than zero");
		}
	}
	//withdrawal setter method
	public void withdrawal(int pin, int withdrawal)
	{
		//validation 1
		if(this.pin==pin)
			//validation 2
		{
			if(withdrawal<=balance && withdrawal>0)
			{
				this.balance=balance-withdrawal;
				System.out.println("withdrawn");
			}
			else
			{
				System.out.println("amount entered cant be withdrawn");
			}
		}
		else
		{
			System.out.println("pin inavlid");
		}
	}
}
