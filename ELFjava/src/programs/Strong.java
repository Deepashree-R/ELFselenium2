package programs;

public class Strong {
	public static void main(String[] args) {
		int num=145;
		int sum=0;
		int copy=num;
		while(num!=0)
		{
		int rem=num%10;
		int fact=1;
		for( int i=rem; i>0; i--)
		{
			fact=fact*i;
		}
		sum=sum+fact;
		num=num/10;
		}
		if(copy==sum)
		{
			System.out.println("given no is strong number");
		}
		else
		{
			System.out.println("given no is not a strong number");
		}
	}
}
