package ArrayOfObjects;

import java.util.Scanner;

public class college {

String sname;
int regno;
String branch;
public college(String sname, int regno, String branch) {
	super();
	this.sname = sname;
	this.regno = regno;
	this.branch = branch;
}
public String toString()
{
	return "Student name "+this.sname+" "+"registration number "+this.regno+"branch "+this.branch;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size=sc.nextInt();
	college arr[]=new college[size];
	System.out.println("enter thde details");
	for(int i=0; i<arr.length; i++)
	{
		sc.nextLine();
		System.out.println("enter the name");
		String sname=sc.nextLine();
		System.out.println("enter register no");
		int regno=sc.nextInt();
		System.out.println("enter the branch");
		String branch=sc.next();
		arr[i]=new college(sname, regno, branch);
	}
	for(int i=0; i<arr.length; i++)
	{
	System.out.println(arr[i]);
	}
	
}
}
