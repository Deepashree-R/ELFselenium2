package Extra_Program;

public class Remove_duplicate_character_in_string {
	public static void duplicate(String s)
	{
		char arr[]=s.toCharArray();
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!='e')
			{
				System.out.print(arr[i]);
			}
		}
		
	}
public static void main(String[] args) {
	duplicate("Selenium");
}
}
