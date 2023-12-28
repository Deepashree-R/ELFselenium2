package Pattern;

public class Pattern15 {
public static void main(String[] args) {
	int n=4;
	for(int row=1; row<=4; row++)
	{
		for(int space=row; space<=n-1; space++)
		{
			System.out.print(" ");
		}
		for( int col=1; col<=row; col++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

}
}
