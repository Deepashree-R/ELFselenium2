package Encapsulation;

public class Bank2 {
	private double balance;
	private int pin=1234;
	Bank2(double balance)
	{
		this.balance=balance;
	}
	public String getbalance(int pin)
	{
		if(this.pin==pin)
		{
			return "balance "+balance;
		}
		else
		{
			return "invalid pin";
		}
	}
}
