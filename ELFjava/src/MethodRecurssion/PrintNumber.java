package MethodRecurssion;

public class PrintNumber {
public static void number(int num)
{
	if(num==0)
	{
		return;
	}
	number(num-1);
	System.out.println(num);
}
public static void main(String[] args) {
	number(5);
}
}
