package Encapsulation;

public class College {
private String sname;
private int regno;
private int sem; 
private int noofbacklog;
private String branch;
public College(String sname, int regno, int sem, int noofbacklog, String branch) {
	super();
	this.sname = sname;
	this.regno = regno;
	this.sem = sem;
	this.noofbacklog = noofbacklog;
	this.branch = branch;
}
public String getsname()
{
	return this.sname;
}
public void setsname(String sname)
{
	this.sname=sname;
}
public int getregno()
{
	return this.regno;
}
public int getsem()
{
	return this.sem;
}
public int getnoofbacklog()
{
	return this.noofbacklog;
}
public String getbranch()
{
	return this.branch;
}
public String toString()
{
	return "Student name is "+this.sname+" registration number is "+this.regno+" semester is "+this.sem+" number of backlog is "+this.noofbacklog+" branch is "+this.branch;
}
}
