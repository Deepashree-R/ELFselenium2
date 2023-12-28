package programs;

public class Seperate {
public static void main(String[] args) {
	String s="28september2023@#";
	String number;
	String alphabet;
	String special_character;
	char arr[]=s.toCharArray();
	for(int i=0; i<arr.length; i++)
			{
				if(arr[i]>='0' && arr[i]<=9)
				{
					number=number+arr[i];
				}
			}
	
}
}
