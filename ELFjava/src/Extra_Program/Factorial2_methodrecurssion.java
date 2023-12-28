package Extra_Program;

public class Factorial2_methodrecurssion {
public static long fact(int n)
{
if(n==0)
{
	return 1;
}
long fact=n*fact(n-1);
return fact;
}
public static void main(String[] args) {
	System.out.println(fact(5));
}
}
