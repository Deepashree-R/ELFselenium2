package Pattern;

public class Pattern19 {
public static void main(String[] args)
{
	
	for(int row=1; row<=5; row++)	
	{
		int num=1;
		char ch='A';
		for(int col=1; col<=5; col++)
		{
			if(col==row)
        {
			System.out.print("@"+" ");
		}
			else if(row<col)
			{
				System.out.print(ch+" ");
				ch++;
			}
			else
			{
				System.out.print(num+" ");
				num++;
			}
			
	}
		System.out.println();
}
}
}

