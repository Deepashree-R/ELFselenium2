package Extra_Program;

public class Pattern2 {
public static void main(String[] args) {
	int num=1;
	for(int row=1; row<=5; row++)
	{
		char ch='A';
		if(row%2!=0)
		{
			for(int col=1; col<=9; col++)
			{
				if(col%2!=0)
				{
					System.out.print(num);
					num++;
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
	
		else
		{
			for(int col=1; col<=9; col++)
			{
				if(col%2==0)
				{
			System.out.print(ch);
			ch++;
			}
			else
			{
				System.out.print(" ");
			}
		}
		
		
	}
		System.out.println();
}

}
}
