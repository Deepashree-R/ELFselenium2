package Encapsulation;

public class Bank {
private String customerName;
private double balance;
private String IFSC;
private String branch;
private long accno;
public Bank(String customerName, double balance, String IFSC, String branch, long accno) {
	super();
	this.customerName = customerName;
	this.balance = balance;
	this.IFSC = IFSC;
	this.branch = branch;
	this.accno = accno;
}
public String getcustomerName()
{
	return this.customerName;
}
public void setcustomerName(String customerName)
{
	this.customerName=customerName;
}
public double getbalance()
{
	return this.balance;
}
public String getIFSC()
{
	return this.IFSC;
}
public String getbranch()
{
	return this.branch;
}
public void setbranch(String branch)
{
	this.branch=branch;
}
public long getaccno()
{
	return this.accno;
}
}
