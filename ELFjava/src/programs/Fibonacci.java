package programs;

public class Fibonacci {
public static void main(String[] args) {
	int a=1;
	int b=1;
	System.out.print(a+" "+b+" ");
	for(int i=1; i<=8; i++)
	{
		int c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
	}
}
}
