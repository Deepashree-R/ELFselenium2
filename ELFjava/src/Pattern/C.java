package Pattern;

public class C {
public static void main(String[] args) {
	int n=3;
	char ch='A';
	for(int row=1; row<=n; row++)
	{
		for(int col=1; col<=n; col++)
		{
			if(row==col)
			{
				System.out.println(ch);
				ch=ch+n;
			}
		}
	}
}
}
