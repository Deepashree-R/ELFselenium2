package Extra_Program;

public class Pattern1 {
public static void main(String[] args) {
	for(int row=1; row<=6; row++)
	{
		char ch='A';
		int num=1;
		for(int col=1; col<=6; col++)
		{
			if(row==col)
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
