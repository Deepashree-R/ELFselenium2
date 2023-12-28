package Practice_Programs2;

public class Program1 {
	public static boolean strongno(int num) {
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
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(strongno(145));
	}
}

