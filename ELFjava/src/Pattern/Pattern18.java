package Pattern;

public class Pattern18 {
public static void main(String[] args) {
	int n=4;
	for(int row=n; row>=1; row--)
	{
		for(int space=row; space<=n-1; space++)
		{
			System.out.print(" ");
		}
		for(int col=1; col<=2*row-1; col++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
