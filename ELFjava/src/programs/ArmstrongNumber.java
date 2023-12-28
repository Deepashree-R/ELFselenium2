package programs;

public class ArmstrongNumber {
	public static void main(String[] args)
	{
		int num=100;
		int count=0;
		int temp=num;
		for(num=100; num<=1000; num++)
		{
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		int arm=0;
		int temp1=num;
		while(temp1!=0)
		{
			int rem=temp1%10;
			int pow=1;
			for(int i=1; i<=count; i++)
			{
				pow=rem*pow;
			}
			arm=arm+pow;
			temp1=temp1/10;
        }
		if (arm==num)
		{
			System.out.println(num);
		}
		}
	}
}
