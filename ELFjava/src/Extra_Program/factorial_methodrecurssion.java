package Extra_Program;

public class factorial_methodrecurssion {
	static int fact=1;
	public static void factorial(int num)
	{
		if(num==0)
		{
			return;
		}
		fact=fact*num;
		factorial(num-1);
	}
public static void main(String[] args) {
    factorial(5);
	System.out.println(fact);
}
}
